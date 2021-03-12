package teste.json;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class JsonApplication {
    static String page1 = "{\"header\":[],\"body\":[{\"template\":\"lt-header\"},{\"template\":\"lt-panel-fit\",\"children\":\"3. Terceira página\",\"styleMedia\":{\"default\":\"\",\"xs\":\"\",\"sm\":\"\",\"md\":\"\",\"lg\":\"\"}},{\"template\":\"lt-img\",\"src\":\"http://dev.labtime.ufg.br/coruja-back/files/download/2720\",\"alt\":\"\",\"className\":\"text-center\",\"styleMedia\":\"\"},{\"template\":\"lt-img\",\"src\":\"http://dev.labtime.ufg.br/coruja-back/files/download/2720\",\"alt\":\"\",\"className\":\"text-center\",\"styleMedia\":\"\"},{\"template\":\"lt-slider\"},{\"template\":\"lt-footer\"}],\"footer\":[]}";
    static String page = "{\"header\":[],\"body\":[{\"template\":\"lt-header\"},{\"template\":\"lt-panel-fit\",\"children\":[{\"template\":\"lt-row\",\"children\":[{\"template\":\"lt-text\",\"styleMedia\":\"text-align: center; margin:40px;\",\"className\":\"col-12\",\"text\":\"1. A família e a promoção da saúde\"}]}]},{\"template\":\"lt-row\",\"styleMedia\":{\"default\":\"margin-top:-60px\",\"md\":\"margin-top: 80px; text-align:center;\"},\"children\":[{\"template\":\"lt-img\",\"className\":\"text-center col-12\",\"src\":\"../resources/img/uni1/sl1/img-1.png\",\"styleMedia\":{\"default\":\"\",\"xs\":\"\",\"sm\":\"\",\"md\":\"\",\"lg\":\"\"}}]},{\"template\":\"lt-row\",\"styleMedia\":\"margin-top:100px\",\"children\":[{\"template\":\"lt-text\",\"className\":\" col-md-8 offset-md-2\",\"text\":\"A família é o primeiro espaço social de um indivíduo. Antes mesmo de frequentar uma escola ou conhecer seu papel de cidadão, a criança, por meio da família, entra em contato com outras pessoas que compõem seu ambiente de crescimento, além de conhecer regras e aspectos da cultura. \",\"styleMedia\":{\"default\":\"\",\"xs\":\"\",\"sm\":\"\",\"md\":\"\",\"lg\":\"\"}},{\"template\":\"lt-img\",\"src\":\"http://dev.labtime.ufg.br/coruja-back/files/download/2823\",\"alt\":\"\",\"className\":\"text-center\",\"styleMedia\":\"\"}]},{\"template\":\"lt-row\",\"styleMedia\":\"margin-top:80px\",\"children\":[{\"template\":\"lt-slot\",\"className\":\"col-md-9 offset-md-3\",\"children\":[{\"template\":\"lt-panel-outline\",\"children\":\"É na família que, provavelmente, ela aprenderá a se comunicar, ouvir os demais e interagir com sujeitos, além de si mesma, que compartilham o mesmo espaço afetivo e ali constroem vínculos. O afeto, favorecido pela convivência, impactará o desenvolvimento de outros fatores como o intelectual e emocional de cada criança até a sua vida adulta  <span class='citacao'>(FREITAS; MANDÚ, 2010)</span>.<br><br> A família exerce, portanto, um forte impacto no comportamento dos indivíduos, já que transmitirá crenças, valores e influenciará sua forma de enxergar e construir as relações sociais e a si mesma <span class='citacao'>(DESSEN; POLONIA, 2007)</span>.\"}]}]},{\"template\":\"lt-img\",\"src\":\"\",\"alt\":\"\",\"className\":\"text-center\",\"styleMedia\":\"\"},{\"template\":\"lt-video\",\"video\":\"Sh9EgCAe-uU\",\"styleMedia\":\"margin-top:90px\"},{\"template\":\"lt-row\",\"styleMedia\":\"margin-top:90px\",\"children\":[{\"template\":\"lt-img\",\"src\":\"http://dev.labtime.ufg.br/coruja-back/files/download/2777\",\"alt\":\"\",\"className\":\"text-center\",\"styleMedia\":\"\"},{\"template\":\"lt-panel\",\"className\":\"col-md-8 offset-md-2\",\"children\":\"Em relação à saúde mental, a família permanece como protagonista na promoção de fatores de proteção e redução dos fatores de risco às condições psicológicas de seus membros, crianças ou adultos. \"},{\"template\":\"lt-text\",\"styleMedia\":\"margin-top:80px\",\"className\":\" col-md-8 offset-md-1\",\"text\":\"Para citar alguns, a literatura tem demonstrado que quando o ambiente doméstico é permeado por regras claras de convivência, distribuição de responsabilidades de cada um e os membros expressam afeto mútuo, pode-se considerar que existe uma teia invisível, porém bastante eficaz para proteger a saúde mental das pessoas nesse contexto.\"}]},{\"template\":\"lt-img\",\"src\":\"http://dev.labtime.ufg.br/coruja-back/files/download/2822\",\"alt\":\"\",\"className\":\"text-center\",\"styleMedia\":\"\"},{\"template\":\"lt-row\",\"styleMedia\":\"margin-top:80px\",\"children\":[{\"template\":\"lt-slot\",\"className\":\"col-md-9 offset-md-3\",\"children\":[{\"template\":\"lt-panel-outline\",\"children\":\"Detalhando, é positiva a existência de regras razoáveis no convívio familiar. Entender os limites acordados, o porquê e as consequências de cada norma trazem aos membros da família uma percepção de organização do ambiente externo que repercute na organização interna das emoções, planos e objetivos. A médio prazo, o que se vê é que desse contexto podemos esperar indivíduos com comportamentos pró-sociais, isto é, que agregam qualidade à vida em sociedade ao invés de comprometê-la negativamente  <span class='citacao'>(MURTA et al., 2018)</span>.\"}]}]},{\"template\":\"lt-video\",\"video\":\"3H0wYc4MBRM\",\"styleMedia\":\"margin-top:90px\"},{\"template\":\"lt-row\",\"styleMedia\":\"margin-top:90px\",\"children\":[{\"template\":\"lt-text\",\"className\":\"col-md-10 offset-md-1\",\"text\":\"Outro ponto considerado promotor de saúde no âmbito familiar é a expressão de afeto. Quando a família cultiva hábitos de demonstrar carinho, amor, atenção e cuidado, os componentes dessa família têm maiores chances de apresentar comportamentos considerados exitosos tais como: boa frequência e bom rendimento escolar na infância e na adolescência, engajamento profissional, capacidade de iniciar e manter relacionamentos funcionais na vida adulta. \"},{\"template\":\"lt-slot\",\"styleMedia\":\"margin-top:80px\",\"className\":\"col-md-10 offset-md-2\",\"children\":[{\"template\":\"lt-panel-outline\",\"children\":\"<p>Um estudo mostrou que a frequência da agitação de crianças em sala de aula e desvios de conduta, tais como descumprimentos de regras e problemas de relacionamento com colegas e professores, é inversamente proporcional à periodicidade com que os pais brincam e fazem carinho em seus filhos em casa. Isto é, quanto mais os pais brincam com as crianças e expressam seu amor por elas, menores as chances de comportamentos indesejados <span class='citacao'>(MATSUKURA; FERNANDES; CID, 2012)</span>.<p>Em casos mais graves, estudos de instituições de saúde sustentam, também, que o distanciamento entre pais e filhos é um fator de risco para suicídio <span class='citacao'>(ABEPS, 2016)</span>.<p>Para adultos, a função da família já não é de formação da sua identidade, mas será de suporte às transições vivenciadas ao longo da vida. Para enfrentar crises naturais, como primeiro emprego e faculdade, têm mais probabilidade de colher bons resultados os sujeitos capazes de identificar em sua família um ponto de apoio tanto para o seu sucesso como para dificuldades. Durante as crises não naturais, como divórcio ou falência, por exemplo, apresentam mais chances de recuperação emocional os indivíduos cujas famílias exercem suporte por meio de atitudes empáticas em lugar de julgamento ou culpabilização <span class='citacao'>(PEREIRA et al., 2018)</span>.</p>\"}]}]},{\"template\":\"lt-img\",\"src\":\"http://dev.labtime.ufg.br/coruja-back/files/download/2720\",\"alt\":\"\",\"className\":\"text-center\",\"styleMedia\":\"\"},{\"template\":\"lt-slider\"},{\"template\":\"lt-footer\"}],\"footer\":[]}";

    public static void main(String[] args) {
        SpringApplication.run(JsonApplication.class, args);
        Gson gson = new Gson();
        JsonElement json = gson.fromJson(page, JsonElement.class);
        jsonObjectProcessing(json);
        System.out.println(page);

    }

    private static void jsonObjectProcessing(JsonElement json) {
        //verifica se é um Objet Json
        if (json.isJsonObject()) {
            System.out.println("É um json object");
            JsonObject jsonObject = json.getAsJsonObject();
            //se for um objeto json percorremos ele
            for (String key : jsonObject.keySet()) {
                JsonElement value = jsonObject.get(key);
                System.out.println("Key: " + key + "=> Value: " + value);

                if (jsonObject.has("template")) {
                    JsonElement template = jsonObject.get("template");
                    if (template.isJsonPrimitive() && template.getAsString().equals("lt-img")) {
                        if (jsonObject.has("src")) {
                            JsonElement src = jsonObject.get("src");
                            System.out.println("Tem o campo" + src);
                            //só fazer a troca quando a string não é vazia
                            if (!src.getAsString().equals("")) {
                                page = page.replaceFirst(src.toString(), "\"novaURLTeste\"");
                            }
                            //se esse objeto tem o campo src e template = lt-img não precisa continuar percorrendo esse objeto
                            break;
                        }
                    }
                }//se o json for array ou objeto chamamos a recursão. Para tipo primitivo não é necessário chamar a recursão
                if (value.isJsonArray() || value.isJsonObject()) {
                    jsonObjectProcessing(value);
                }
            }
            //se o json for array  chamamos a recursão.
        } else if (json.isJsonArray()) {
            JsonArray jsonArray = json.getAsJsonArray();
            System.out.println("É um json array");
            for (JsonElement jsonElement : jsonArray) {
                jsonObjectProcessing(jsonElement);
            }
            //Para tipo primitivo não é necessário chamar a recursão
        } else // se a função receber um tipo primitivo provavelmente  tem algum erro
            if (json.isJsonPrimitive()) System.out.println("É um json Primitivo" + json);
            else {
            // se a função receber um objeto que não é json tem algum erro
            System.out.println("Não é um json" + json);
        }
    }
}
