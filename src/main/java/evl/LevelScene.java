package evl;

public class LevelScene extends Scene {
    public LevelScene(){
        Window.get().r = 1;
        Window.get().g = 1;
        Window.get().b = 1;
    }

    @Override
    public void update(float dt) {
        System.out.println("inside level scene");
    }

}
