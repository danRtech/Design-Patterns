package org.danrtech.builder;


/**
 * "Builder" design pattern example.
 */
public class User {
    private final String name;
    private final int age;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public static void main(String[] args){
        User usr = new Builder().age(5).name("Alex").build();
        System.out.println(usr.age);
        System.out.println(usr.name);
    }


    public static class Builder {
        private String name;
        private int age;

        public Builder name(String name) {  // No need for "set" prefix
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
