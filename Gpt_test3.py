import http.client
import json
# 202507031055 是正常的。 实际版本：gpt-3.5-turbo
conn = http.client.HTTPSConnection("api.302.ai")
payload = json.dumps({
   "model": "gpt-3.5-turbo",
   "messages": [
      {
         "role": "user",
         "content": "Hello!"
      }
   ]
})
headers = {
   'Accept': 'application/json',
   'Authorization': 'Bearer sk-xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx',
   'Content-Type': 'application/json'
}
conn.request("POST", "/v1/chat/completions", payload, headers)
res = conn.getresponse()
data = res.read()
print(data.decode("utf-8"))
