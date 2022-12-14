package game;

import game.managers.ResetManager;

/**
 * It is an interface that will be implemented by those classes that will perform corresponding operation
 * when the reset action is executed.
 *
 * @author Kuah Jia Chen
 */
public interface Resettable {

    /**
     * Allows any classes that use this interface to reset abilities, attributes, and/or items.
     * HINT: play around with capability, the actual implementation happens in the tick or playTurn method.
     */
    void resetInstance();

    /**
     * a default interface method that register current instance to the Singleton manager.
     * It allows corresponding class uses to be affected by global reset
     */
    default void registerInstance(){
        ResetManager.getInstance().appendResetInstance(this);
    }
}
