package proxy;

public class Config
{
    private String path_dane="C:\\Users\\Marcin\\IdeaProjects\\proxy_kolos2\\src\\proxy\\plik.txt";
    private String path_uprawnienia="C:\\Users\\Marcin\\IdeaProjects\\proxy_kolos2\\src\\proxy\\plik1.txt";
    private String login;

    public Config(String login) {
        this.login=login;
    }

    public String getPath_dane() {
        return path_dane;
    }

    public String getPath_uprawnienia() {
        return path_uprawnienia;
    }

    public String getLogin() {
        return login;
    }

}
