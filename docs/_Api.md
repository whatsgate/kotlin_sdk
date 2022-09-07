# _Api

All URIs are relative to *https://whatsgate.ru/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMediaPost**](_Api.md#getMediaPost) | **POST** /get-media | Возвращает объект медиафайла, прикрепленного к сообщению

<a name="getMediaPost"></a>
# **getMediaPost**
> InlineResponse2003 getMediaPost(body)

Возвращает объект медиафайла, прикрепленного к сообщению

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = _Api()
val body : GetmediaBody = {
  "value" : {
    "WhatsappID" : "YOUR_WHATSAPP_ID",
    "mediaKey" : "TuM9wXQZBmERUCzwnIZe80GwZ5lPDIDsNE+vewnAxho="
  }
} // GetmediaBody | Запрашивает и возвращает медиа-файл, прикрепленный к сообщению по идентификатору mediaKey.
try {
    val result : InlineResponse2003 = apiInstance.getMediaPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling _Api#getMediaPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling _Api#getMediaPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetmediaBody**](GetmediaBody.md)| Запрашивает и возвращает медиа-файл, прикрепленный к сообщению по идентификатору mediaKey. |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

