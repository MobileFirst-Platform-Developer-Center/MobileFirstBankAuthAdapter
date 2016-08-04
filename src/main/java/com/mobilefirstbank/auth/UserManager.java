/*
 *  © Copyright 2016 IBM Corp.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.mobilefirstbank.auth;

import java.util.Date;
import java.util.HashMap;

public class UserManager {
    public HashMap<String, User> users;


    public UserManager() {
        long DAY_IN_MS = 1000 * 60 * 60 * 24;

        users = new HashMap<String, User>();

        User john = new User("john", "John", "Doe", "john123");
        john.setAttribute("balance", 245006.56);
        john.setAttribute("lastlogin", new Date(System.currentTimeMillis() - (7 * DAY_IN_MS)));
        users.put(john.getId(), john);

        User tommy = new User("tommy", "Tommy", "Atkins", "tommy234");
        tommy.setAttribute("balance", 500.67);
        tommy.setAttribute("lastlogin", new Date(System.currentTimeMillis()));
        users.put(tommy.getId(), tommy);

        User fred = new User("fred", "Fred", "Bloggs", "fred123");
        fred.setAttribute("balance", 1245002.46);
        fred.setAttribute("lastlogin", new Date(System.currentTimeMillis() - (2 * DAY_IN_MS)));
        users.put(fred.getId(), fred);

        User ola = new User("ola", "Ola", "Nordmann", "ola123");
        ola.setAttribute("balance", 783983.73);
        ola.setAttribute("lastlogin", new Date(System.currentTimeMillis() - (3 * DAY_IN_MS)));
        users.put(ola.getId(), ola);
    }

    public User getUser(String id) {
        return (User) users.get(id);
    }
}
