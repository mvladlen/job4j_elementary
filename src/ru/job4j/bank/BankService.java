package ru.job4j.bank;

import java.util.*;

/**
 * Класс предназначен для управления пользователями и счетами
 */
public class BankService {
    /**
     * связи пользователей и  счетов хранятся в HashMap
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя без проверки на дубли
     *
     * @param user объект пользователь
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет счет в список счетов User, которого находит по
     *
     * @param passport - паспорт
     * @param account  - счет
     */
    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            Optional<List<Account>> accounts = Optional.ofNullable(users.get(user.get()));

            if (accounts.isPresent()) {
                if (accounts.get().contains(account)) {
                    return;
                }
                accounts.get().add(account);
                users.put(user.get(), accounts.get());
            }
        }
    }

    /**
     * Метод находит пользователя по паспорту, если таких несколько, то находится только один
     *
     * @param passport - паспорт
     * @return - пользователь
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(p -> p.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет счет по реквизитам и паспорту
     *
     * @param passport  - паспорт
     * @param requisite - реквизиты
     * @return - найденный счет
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> p = findByPassport(passport);
        return p.flatMap(user -> users.get(user)
                .stream()
                .filter(r -> r.getRequisite().equals(requisite))
                .findFirst());

    }

    /**
     * Метод позволяет перевести средства между счетами
     *
     * @param srcPassport   - поспорт отправителя
     * @param srcRequisite  реквизиты счета отправителя
     * @param destPassport  - паспорт получателя
     * @param destRequisite - реквизиты счета получателя
     * @param amount        - сумма перевода
     * @return - true если перевод выполнен, false - перевод невозможен
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        // выбираем счет отправителя
        Optional<Account> source = findByRequisite(srcPassport, srcRequisite);
        // выбираем счет получателя
        Optional<Account> destination = findByRequisite(destPassport, destRequisite);
        // проверяем все ли нашлось, достаточность суммы на счете
        if (source.isEmpty()
                || destination.isEmpty()
                || source.get().getBalance() < amount) {
            return false;
        }
        source.get().setBalance(source.get().getBalance() - amount);
        destination.get().setBalance(destination.get().getBalance() + amount);
        return true;
    }
}