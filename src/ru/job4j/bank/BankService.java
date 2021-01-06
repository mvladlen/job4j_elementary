package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
     * @param user объект пользователь
     */
    public void addUser(User user) {
            users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет счет в список счетов User, которого находит по
     * @param passport - паспорт
     * @param account - счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> accounts = users.get(user);
        if (accounts.contains(account)) {
            return;
        }
        accounts.add(account);
        users.put(user, accounts);
    }

    /**
     * Метод находит пользователя по паспорту, если таких несколько, то находится только один
     * @param passport - паспорт
     * @return - пользователь
     */
    public User findByPassport(String passport) {
        for (User key : users.keySet()) {
            if (key.getPassport().equals(passport)) {
                return key;
            }
        }
        return null;
    }

    /**
     * Метод ищет счет по реквизитам и паспорту
     * @param passport - паспорт
     * @param requisite - реквизиты
     * @return - найденный счет
     */
    public Account findByRequisite(String passport, String requisite) {
        if (findByPassport(passport) != null) {
            List<Account> accounts = users.get(findByPassport(passport));
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод позволяет перевести средства между счетами
     * @param srcPassport - поспорт отправителя
     * @param srcRequisite реквизиты счета отправителя
     * @param destPassport - паспорт получателя
     * @param destRequisite - реквизиты счета получателя
     * @param amount - сумма перевода
     * @return - true если перевод выполнен, false - перевод невозможен
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        // выбираем счет отправителя
        Account source = findByRequisite(srcPassport, srcRequisite);
        // выбираем счет получателя
        Account destination = findByRequisite(destPassport, destRequisite);
        // проверяем все ли нашлось, достаточность суммы на счете
        if (source == null
                || destination == null
                || source.getBalance() < amount) {
            return false;
        }
        source.setBalance(source.getBalance() - amount);
        destination.setBalance(destination.getBalance() + amount);
        return true;
    }
}