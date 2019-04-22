package rpgdemo;

import java.time.Year;

public class ObjectArraySortDemo {
    public static void sort(Hero[] heroArray){
        Hero tempHero = null;
        for (int i=0;i<heroArray.length;i++){
            for (int j=0;j<heroArray.length-i-1;j++){
                if (heroArray[j].compareToByName(heroArray[j+1]) < 0){
                    tempHero = heroArray[j];
                    heroArray[j] = heroArray[j+1];
                    heroArray[j+1] = tempHero;
                }
            }
        }
    }
    public static void main(String[] args){
        Warrior zhanshi1 = new Warrior();
        Warrior zhanshi2 = new Warrior();
        Warrior zhanshi3 = new Warrior();
        Warrior zhanshi4 = new Warrior();
        Warrior zhanshi5 = new Warrior();
        Archmage fashi1 = new Archmage();
        Archmage fashi2 = new Archmage();
        Archmage fashi3 = new Archmage();
        Archmage fashi4 = new Archmage();
        Archmage fashi5 = new Archmage();

        Hero[] heroArray ={
                zhanshi1,zhanshi2,zhanshi3,zhanshi4,zhanshi5,fashi1,fashi2,fashi3,fashi4,fashi5
        };

        System.out.println("排序前：");
        System.out.println("级别\t昵称\t\tmaxLife\tlife\t攻击力");

        for(Hero hero:heroArray){
            System.out.println(hero);
        }

        sort(heroArray);
        System.out.println("排序后：");
        System.out.println("级别\t昵称\t\tmaxLife\tlife\t攻击力");

        for(Hero hero:heroArray){
            System.out.println(hero);
        }

//多态  同一个实体，同时具有多种形式

    }

}
