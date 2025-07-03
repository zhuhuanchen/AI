import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class Gpt_Test {
    public static void main(String[] args) {

                Unirest.config()
                .connectTimeout(0)    // 连接超时（0 表示无限）
                .socketTimeout(0);    // 响应读取超时（0 表示无限）
        HttpResponse<String> response = Unirest.post("https://api.302.ai/v1/chat/completions")
                .header("Accept", "application/json")
                .header("Authorization", "Bearer sk-xxxxxxxxxxxxxxxxxxxxxx")
                .header("Content-Type", "application/json")
                .body("{\n  \"model\": \"gpt-3.5-turbo\",\n  \"messages\": [{\"role\": \"user\", \"content\": \"上海今天的天气怎么样？\"}]\n}")
                .asString();

        System.out.println(response.getBody());
    }
}


