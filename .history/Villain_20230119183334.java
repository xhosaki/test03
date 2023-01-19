import java.util.Random;
public class Villain {
String name;
int record;
Villain() {
Random random = new Random();
this.name = this.summonVillain(random.nextInt(4));
this.record = random.nextInt(4);
}
String summonVillain(int vnumber) {
String villains[] = {"アイアンモンガー", "ジョーカー", "グリーンゴブリン", "バイキンマン" };
return villains[vnumber];
}
@Override
public String toString() {
return this.name + ":前科[" + this.record + "]";
}
}