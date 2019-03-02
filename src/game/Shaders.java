package game;

import engine.OpenGL.ShaderProgram;

public class Shaders {
	public static ShaderProgram flipShader;
	public static ShaderProgram textureShader;
	public static ShaderProgram buttonShader;
	public static void createMainShaders() {
		flipShader = new ShaderProgram("flipShader");
		textureShader = new ShaderProgram("textureShader");
		buttonShader = new ShaderProgram("buttonShader");
	}
}
