package number2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        Map<String,Integer> map = new HashMap<>();

        for (AutoStore a : AutoStore.values()) {
             if(sum > a.getCost()){
                map.put(a.getModel(),a.getMaxSpeed());
             }
        }

        ArrayList<Integer> valueOfMap = new ArrayList<>(map.values());
        ArrayList<AutoStore> result = new ArrayList<>();

        Collections.sort(valueOfMap);

        for (int num: valueOfMap) {
            for (Map.Entry<String,Integer> entry: map.entrySet()) {
                if(entry.getValue().equals(num)){
                    for (AutoStore a : AutoStore.values()) {
                        if (entry.getValue().equals(a.getMaxSpeed()))
                            result.add(a);
                    }

                }
            }
        }

        for (AutoStore a : result) {
            System.out.println(a.toString());
        }
    }
}