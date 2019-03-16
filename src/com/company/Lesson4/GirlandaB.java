package com.company.Lesson4;

public class GirlandaB {

        public static void Miganie(int a) {
            System.out.println(Integer.toBinaryString(a));
        }

        public  static void First(int a) throws InterruptedException {
            for (int i = 0; i < 40; i++) {
               ;
                a = ~a;
                Thread.sleep(200);
            }
        }

        public  static void Second(int a) throws InterruptedException {
            for (int i = 0; i < 40; i++) {
                Miganie(a);
                a = a >> 1;
                Thread.sleep(300);
            }
        }

        public  static String Third(int a) {
            System.out.println();
            Miganie(a);
            return (a & 1) == 1 ? "Гирлянда ВКЛ" : "Гирлянда ВЫКЛ";
        }
    }
