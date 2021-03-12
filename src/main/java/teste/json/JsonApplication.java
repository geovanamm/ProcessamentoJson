package teste.json;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Iterator;
import java.util.Set;

@SpringBootApplication
public class JsonApplication {

    public static void main(String[] args) {
        SpringApplication.run(JsonApplication.class, args);
        String page = "{\"header\":[],\"body\":[{\"template\":\"lt-header\"},{\"template\":\"lt-panel-fit\",\"children\":\"3. Terceira página\",\"styleMedia\":{\"default\":\"\",\"xs\":\"\",\"sm\":\"\",\"md\":\"\",\"lg\":\"\"}},{\"template\":\"lt-img\",\"src\":\"http://dev.labtime.ufg.br/coruja-back/files/download/2720\",\"alt\":\"\",\"className\":\"text-center\",\"styleMedia\":\"\"},{\"template\":\"lt-img\",\"src\":\"http://dev.labtime.ufg.br/coruja-back/files/download/2720\",\"alt\":\"\",\"className\":\"text-center\",\"styleMedia\":\"\"},{\"template\":\"lt-slider\"},{\"template\":\"lt-footer\"}],\"footer\":[]}";

        Gson gson = new Gson();
        JSONObject json = gson.fromJson(page, JSONObject.class);

        printJsonObject(json);

    }

    public static void printJsonObject(JSONObject json) {
        Iterator iterator = json.keySet().iterator();

// Verifica se há mais alguma key
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            JSONObject jsonObject = new Gson().fromJson(json.get(key).toString(), JSONObject.class);

            System.out.println(key +": " + jsonObject);
        }
    }
}
