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

import java.util.HashMap;
import java.util.Map;

public class User {
    private String id;
    private String firstName;
    private String lastName;
    private String password;
    private Map<String, Object> attributes = new HashMap<String, Object>();

    public User(String id, String firstName, String lastName, String password) {
        this.id = id;
        this.password = password;

        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        this.setAttribute("firstname", firstName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        this.setAttribute("lastname", lastName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setAttribute(String property, Object value) {
        attributes.put(property, value);
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }
}
