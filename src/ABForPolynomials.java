import java.util.*;

/**
 * Created by tage on 2/24/16.
 */
public class ABForPolynomials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split(" ");
        s = sc.nextLine();
        String[] b = s.split(" ");
        Map<String, Double> mapA = new HashMap<>();
        Map<String, Double> mapB = new HashMap<>();
        int k1 = Integer.parseInt(a[0]);
        int k2 = Integer.parseInt(b[0]);
        for (int i = 1; i <= 2 * k1; i++) {
            mapA.put(a[i], Double.parseDouble(a[++i]));
        }
        for (int i = 1; i <= 2 * k2; i++) {
            mapB.put(b[i], Double.parseDouble(b[++i]));
        }
        Map<String,Double> mapC = new HashMap<>();

        Iterator<Map.Entry<String, Double>> it = mapA.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double> entry = it.next();
            if (mapB.get(entry.getKey()) == null) {
                mapC.put(entry.getKey(), entry.getValue());
            } else {
                if (entry.getValue() + mapB.get(entry.getKey())!=0.0)
                mapC.put(entry.getKey(), entry.getValue() + mapB.get(entry.getKey()));
            }
        }

        it = mapB.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Double> entry = it.next();
            if (mapA.get(entry.getKey()) == null) {
                mapC.put(entry.getKey(), entry.getValue());
            } else {
                if (entry.getValue() + mapA.get(entry.getKey())!=0.0)
                mapC.put(entry.getKey(), entry.getValue() + mapA.get(entry.getKey()));
            }
        }

        String[] sKey = new String[mapC.size()];
        mapC.keySet().toArray(sKey);
        int[] cKey = new int[sKey.length];
        for (int i = 0 ; i < sKey.length;i++) {
            cKey[i] = Integer.parseInt(sKey[i]);
        }
        Arrays.sort(cKey);
        System.out.print(mapC.size());
        for (int i = cKey.length-1; i >=0;i-- ) {
            System.out.printf(" " + "%d" + " " + "%.1f",cKey[i],mapC.get(cKey[i]+ ""));
        }

    }
}

