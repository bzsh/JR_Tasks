package com.javarush.task.task20.task2002;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {

        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);

            JavaRush javaRush = new JavaRush();

            for (int i = 0; i < 10; i++) {
                User u = new User();
                u.setMale(i % 2 == 0);
                u.setFirstName("User" + i);
                u.setLastName("Useroff" + i);
                u.setCountry(User.Country.OTHER);
                u.setBirthDate(new Date());
                javaRush.users.add(u);
            }

            javaRush.save(outputStream);
            outputStream.close();

            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);

            System.out.println(javaRush.equals(loadedObject));
            inputStream.close();

            yourFile.deleteOnExit();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter pw = new PrintWriter(outputStream);
            if (!this.users.isEmpty()) {
                for (User user : users) {
                    pw.println(user.getFirstName());
                    pw.println(user.getLastName());
                    pw.println(user.getCountry().getDisplayName());
                    pw.println(user.getBirthDate().getTime());
                    pw.println(user.isMale());
                }
            }
            pw.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            while (br.ready()) {
                User u = new User();
                u.setFirstName(br.readLine());
                u.setLastName(br.readLine());
                switch (br.readLine()) {
                    case "Ukraine":
                        u.setCountry(User.Country.UKRAINE);
                        break;
                    case "Russia":
                        u.setCountry(User.Country.RUSSIA);
                        break;
                    case "Other":
                        u.setCountry(User.Country.OTHER);
                        break;
                }
                u.setBirthDate(new Date(Long.parseLong(br.readLine())));
                u.setMale(br.readLine().equals("true"));
                this.users.add(u);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
