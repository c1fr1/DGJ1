package game;

import engine.OpenGL.EnigWindow;

import static org.lwjgl.glfw.GLFW.*;

public class UserControls {
	public static int[] left = new int[] {GLFW_KEY_D};
	public static int[] right = new int[] {GLFW_KEY_F};
	public static int[] up = new int[] {GLFW_KEY_J};
	public static int[] down = new int[] {GLFW_KEY_K};
	public static int[] quit = new int[] {GLFW_KEY_ESCAPE};
	
	public static float sensitivity = 1f/500f;
	
	public static boolean left(EnigWindow window) {
		for (int i:left) {
			if (window.keys[i] == 1) {
				return true;
			}
		}
		return false;
	}
	public static boolean right(EnigWindow window) {
		for (int i:right) {
			if (window.keys[i] == 1) {
				return true;
			}
		}
		return false;
	}
	public static boolean up(EnigWindow window) {
		for (int i:up) {
			if (window.keys[i] == 1) {
				return true;
			}
		}
		return false;
	}
	public static boolean down(EnigWindow window) {
		for (int i:down) {
			if (window.keys[i] == 1) {
				return true;
			}
		}
		return false;
	}
	public static boolean quit(EnigWindow window) {
		for (int i:quit) {
			if (window.keys[i] == 1) {
				return true;
			}
		}
		return false;
	}
}