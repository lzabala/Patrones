package config;

public class AppConfiguration {
	
	private static AppConfiguration appConfig; 
	private String idioma;
	private String pathToFile;
	
	public String getIdioma() {
		return idioma;
	}

	public String getPathToFile() {
		return pathToFile;
	}
	
	private AppConfiguration() {
		idioma = loadIdioma();
		pathToFile = loadPath();
	}
	
	private String loadPath() {
		//Aquí va el código para recuperar el path del fichero de config
		return "path/to/File";
	}

	private String loadIdioma() {
		//Aquí va el código para recuperar el idioma del fichero de config
		return "Español";
	}

	public static AppConfiguration getConfig() {
		if (appConfig == null) {
			appConfig = new AppConfiguration();
		}
		
		return appConfig;
	}
}
