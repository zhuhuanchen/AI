import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.apache.hadoop.shaded.com.squareup.okhttp.*;

import java.io.IOException;

public class Gpt_Test2 {
    public static void main(String[] args) throws IOException {


//        OkHttpClient client = new OkHttpClient().Builder().build();
        OkHttpClient client = new OkHttpClient();
//        OkHttpClient client = new OkHttpClient. Builder()
//                .connectTimeout(10, TimeUnit.SECONDS)  // 连接超时
//                .readTimeout(30, TimeUnit.SECONDS)     // 读取超时
//                .build();
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(mediaType, "{\n  \"model\": \"gpt-3.5-turbo\",\n  \"messages\": [{\"role\": \"user\", \"content\": \"Hello,1+1等于几!\"}]\n}");
        Request request = new Request.Builder()
                .url("https://api.302.ai/v1/chat/completions")
                .method("POST", body)
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", "Bearer sk-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx")
                .addHeader("Content-Type", "application/json")
                .build();
        Response response = client.newCall(request).execute();



        System.out.println(response.body().string());
    }
}


