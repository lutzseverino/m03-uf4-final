package cat.lasallegracia;

import cat.lasallegracia.modules.SpotifyModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

public enum Main {
    INSTANCE;

    public static void main(String[] args) {
        String configPath = args.length > 0 ? args[0] : "src/main/resources/config.yaml";
        Injector injector = Guice.createInjector(new SpotifyModule(configPath));
        JavaSimpleMusicRater instance = injector.getInstance(JavaSimpleMusicRater.class);

        instance.start();
    }

}