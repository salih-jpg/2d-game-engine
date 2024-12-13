package evl;

import org.lwjgl.system.CallbackI;

public abstract class Scene {

    protected Camera camera;
    public Scene(){}

    public void init(){

    }
    public abstract void update(float dt);
}
