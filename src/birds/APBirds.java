package birds;
public class APBirds {
    public static void main(String[] args) {
        APBirdSanctuary birds = new APBirdSanctuary();
        birds.allEat();
    }
}

abstract class APBird
{
    private String myName;
    private String myNoise;
    public APBird(String name,String noise)
    {
        myName = name;
        myNoise = noise;
    }
    public String getName()
    {
        return(myName);
    }
    public String getNoise()
    {
        return(myNoise);
    }    
    public abstract String getFood();
}

abstract class APOwl extends APBird
{
    protected String food;
    
    public APOwl(String name)
    {
        super(name,"hoot");
    }
}

class APSnowyOwl extends APOwl
{
    public APSnowyOwl()
    {
        super("Snowy Owl");
        int foodType = (int)(Math.random()*3);
        if (foodType == 0)
            food = "hare";
        else if (foodType == 1)
            food = "lemming";
        else
            food = "small bird";
    }
    public String getFood()
    {
        return(food);
    }
}
class APElfOwl extends APOwl
{
    public APElfOwl()
    {
        super("Elf Owl");
        int foodType = (int)(Math.random()*2);
        if (foodType == 0)
            food = "snake";
        else
            food = "mouse";

    }
    public String getFood()
    {
        return(food);
    }
}

class APBirdSanctuary
{
    private APBird[] birdList;
    APBirdSanctuary()
    {
        birdList = new APBird[5];
        birdList[0] = new APElfOwl();
        birdList[1] = new APSnowyOwl();
        birdList[2] = new APElfOwl();
        birdList[3] = new APElfOwl();
        birdList[4] = new APSnowyOwl();
    }
    public void allEat()
    {
//        for (int index=0;index<birdList.length;index++)
//        {
//            System.out.println(birdList[index].getName() + " " + birdList[index].getFood());
//        }
        for (APBird bird : birdList)
        {
            System.out.println(bird.getName() + " " + bird.getFood());
        }        
    }
    
}






