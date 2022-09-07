# DefaultApi

All URIs are relative to *https://whatsgate.ru/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkPost**](DefaultApi.md#checkPost) | **POST** /check | Проверка зарегистрирован ли номер в WhatsApp
[**getChatsPost**](DefaultApi.md#getChatsPost) | **POST** /get-chats | Возвращает список активных чатов
[**seenPost**](DefaultApi.md#seenPost) | **POST** /seen | Отправляет команду в чат, что последние сообщения просмотрены
[**sendMessage**](DefaultApi.md#sendMessage) | **POST** /send | Отправка сообщения

<a name="checkPost"></a>
# **checkPost**
> InlineResponse2001 checkPost(body)

Проверка зарегистрирован ли номер в WhatsApp

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val body : CheckBody = {
  "value" : {
    "WhatsappID" : "YOUR_WHATSAPP_ID",
    "number" : "79999999999"
  }
} // CheckBody | Проверяет, зарегистрирован ли указанный номер в WhatsApp. Номер указывается в формате только цифр, например 79999999999
try {
    val result : InlineResponse2001 = apiInstance.checkPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#checkPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#checkPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CheckBody**](CheckBody.md)| Проверяет, зарегистрирован ли указанный номер в WhatsApp. Номер указывается в формате только цифр, например 79999999999 |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChatsPost"></a>
# **getChatsPost**
> InlineResponse2002 getChatsPost(body)

Возвращает список активных чатов

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val body : GetchatsBody = {
  "value" : {
    "WhatsappID" : "YOUR_WHATSAPP_ID"
  }
} // GetchatsBody | Запрашивает и возвращает список активных чатов, включая контакты и группы. В объекте группы находится идентификатор группы, список всех участников группы, права участников (является ли участник администратором группы).
try {
    val result : InlineResponse2002 = apiInstance.getChatsPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#getChatsPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#getChatsPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GetchatsBody**](GetchatsBody.md)| Запрашивает и возвращает список активных чатов, включая контакты и группы. В объекте группы находится идентификатор группы, список всех участников группы, права участников (является ли участник администратором группы). |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="seenPost"></a>
# **seenPost**
> InlineResponse2004 seenPost(body)

Отправляет команду в чат, что последние сообщения просмотрены

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val body : SeenBody = {
  "value" : {
    "WhatsappID" : "YOUR_WHATSAPP_ID",
    "recipient" : {
      "id" : "79999999999@c.us"
    }
  }
} // SeenBody | Команда устанавливает у всех сообщений в указанном чате статус просмотрены.
try {
    val result : InlineResponse2004 = apiInstance.seenPost(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#seenPost")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#seenPost")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SeenBody**](SeenBody.md)| Команда устанавливает у всех сообщений в указанном чате статус просмотрены. |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sendMessage"></a>
# **sendMessage**
> InlineResponse200 sendMessage(body)

Отправка сообщения

### Example
```kotlin
// Import classes:
//import io.swagger.client.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = DefaultApi()
val body : SendBody = {
  "value" : {
    "WhatsappID" : "YOUR_WHATSAPP_ID",
    "async" : false,
    "recipient" : {
      "id" : "79999999999@c.us"
    },
    "message" : {
      "body" : "Hello world!"
    }
  }
} // SendBody | Отправляет текстовое или мультимедийное сообщение контакту либо группе. Может использоваться синхронно (возвращает ответ после отправки сообщения, ответ содержит объект отправленного сообщения с идентификатором), либо асинхронно (ответ содержит результат постановки в очередь, а отправленное сообщение приходит на указанный webhook). По умолчанию используется асинхронная отправка.
try {
    val result : InlineResponse200 = apiInstance.sendMessage(body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DefaultApi#sendMessage")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DefaultApi#sendMessage")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SendBody**](SendBody.md)| Отправляет текстовое или мультимедийное сообщение контакту либо группе. Может использоваться синхронно (возвращает ответ после отправки сообщения, ответ содержит объект отправленного сообщения с идентификатором), либо асинхронно (ответ содержит результат постановки в очередь, а отправленное сообщение приходит на указанный webhook). По умолчанию используется асинхронная отправка. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

