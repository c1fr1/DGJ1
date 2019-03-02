package game;

import engine.*;
import engine.OpenGL.*;
import org.joml.Matrix4f;
import org.joml.Vector2f;

import java.util.ArrayList;

import static game.Main.entityObj;
import static game.Main.gameOverOpacity;
import static game.Main.titleObj;
import static game.Shaders.*;
import static game.UserControls.*;
import static java.lang.Math.PI;
import static java.lang.Math.random;
import static org.lwjgl.opengl.GL11.GL_DEPTH_TEST;
import static org.lwjgl.opengl.GL11.glDisable;

public class MainView extends EnigView {
	public static MainView main;
	
	public Matrix4f perspectiveMatrix;
	
	public MainView(EnigWindow window) {
		super(window);
		glDisable(GL_DEPTH_TEST);
		perspectiveMatrix = window.getSquarePerspectiveMatrix(100);
		
	}
	
	public boolean loop() {
		FBO.prepareDefaultRender();
		FBO.clearCurrentFrameBuffer();
		
		if (UserControls.quit(window)) {
			return true;
		}
		return false;
	}
	
	public Matrix4f getPerspectiveMatrix() {
		return new Matrix4f(perspectiveMatrix);
	}
	public Matrix4f getUnTranslatedPerspectiveMatrix() {
		return new Matrix4f(perspectiveMatrix);
	}
}
