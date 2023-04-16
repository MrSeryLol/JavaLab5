package client;

import compute.Task;

import java.io.Serializable;
import java.util.ArrayList;

public class TaskLab1 implements Task<String>, Serializable {
    private String[] _args;


    public TaskLab1(String[] args) {
        this._args = args;
    }


    public String execute() {
        return computeTask(_args);
    }

    public static String computeTask(String[] _args) {
        ArrayList<Integer> evenList = new ArrayList<>();//создане списка для чётных положительных чисел
        ArrayList<Integer> oddList = new ArrayList<>();//создане списка для чётных отрицательных чисел
        for (String x : _args) { //Вывод всех заданных параметров командной строки
            /* преобразвание строки, хранящейся в переменной "х" в целое число
            и проверка этого числа на чётность*/
            if (Integer.parseInt(x) % 2 == 0 & Integer.parseInt(x) > 0) {
                evenList.add(Integer.parseInt(x));//добавление в список чётного и положительного
            } else if (Integer.parseInt(x) % 2 != 0 & Integer.parseInt(x) < 0) {
                oddList.add(Integer.parseInt(x));//добавление в список нечётного и отрицательного
            }
        }

        if (evenList.size() > oddList.size()) {
            return "Положительных чётных чисел: " + evenList.size() +
                    " больше, чем отрицательных нечётных: " + oddList.size();
        }
        else if (evenList.size() < oddList.size()) {
            return "Отрицательных нечётных чисел: " + oddList.size() +
                    " больше, чем положительных чётных: " + evenList.size();
        }
        else {
            return "Положительных чётных чисел и отрицательных нечётных чисел, равное количество: " +
                    evenList.size();
        }
    }
}
