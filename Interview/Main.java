package Interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Component {
    private int id;
    private int price;
    private int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void printMe() {
        System.out.println(this.id + ". " + this.price + ", " + this.weight);
    }

}

class Car {
    private List<Component> list = new ArrayList<Component>();

    public List<Component> getList() {
        return this.list;
    }

    public void setList(List<Component> componentList) {
        this.list = componentList;
    }

    public List<Component> getTopPriceList(int n) {
        return list;
    }

    public List<Component> getTopWeighList(int n) {
        return list;
    }

    public void printMe(int n) {
        for (int i = 0; i < n; i++) {
            this.list.get(i).printMe();
        }
    }
}

class PriceCompare implements Comparator<Component> {

    @Override
    public int compare(Component o1, Component o2) {
        if (o1.getPrice() < o2.getPrice())
            return 1;
        if (o1.getPrice() > o2.getPrice())
            return -1;
        else
            return 0;
    }
}

class WeightCompare implements Comparator<Component> {

    @Override
    public int compare(Component o1, Component o2) {
        if (o1.getWeight() < o2.getWeight())
            return 1;
        if (o1.getWeight() > o2.getWeight())
            return -1;
        else
            return 0;
    }
}

class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        List<Component> tempComponentList = new ArrayList<Component>(10);

        for (int i = 0; i < 10; i++) {
            Component tempComponent = new Component();
            tempComponent.setId(i);
            System.out.println("Enter price");
            int p = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            // tempComponent.setPrice((i+1)*10);
            tempComponent.setPrice(p);
            System.out.println("Enter weight");
            int w = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            // tempComponent.setWeight((i+1)*100);
            tempComponent.setWeight(w);
            tempComponentList.add(tempComponent);
            // component = null;
        }

        Car o = new Car();
        o.setList(tempComponentList);

        o.printMe(10);

        PriceCompare priceCompare = new PriceCompare();
        Collections.sort(o.getList(), priceCompare);

        o.printMe(10);
        o.printMe(5);

        Comparator<Component> WeightCompare = new Comparator<Component>() {
            @Override
            public int compare(Component o1, Component o2) {
                if (o1.getWeight() < o2.getWeight())
                    return 1;
                if (o1.getWeight() > o2.getWeight())
                    return -1;
                else
                    return 0;
            }
        };

        Collections.sort(o.getList(), WeightCompare);

        o.printMe(10);
        o.printMe(5);

        Comparator<Component> c = (Component o1, Component o2) -> {
            if (o1.getWeight() < o2.getWeight())
                return 1;
            if (o1.getWeight() > o2.getWeight())
                return -1;
            else
                return 0;
        };

        Collections.sort(o.getList(), c);

        o.printMe(10);
        o.printMe(5);
    }
}