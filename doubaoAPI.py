import requests
# 以为是豆包，其实是阿里通义千问的大数据模型
url = "https://dashscope.aliyuncs.com/api/v1/services/aigc/text-generation/generation"
# https://bailian.console.aliyun.com/?tab=model#/api-key
headers = {
    "Authorization": "Bearer sk-69038fb4d8d6451e95b22c06d0d4020b",
    "Content-Type": "application/json"
}
data = {
    "model": "qwen-plus",
    "input": {"prompt": "是你厉害一些，还是chatgpt厉害一些"},
    "parameters": {"result_format": "message"}
}
resp = requests.post(url, headers=headers, json=data)
print(resp.json())

