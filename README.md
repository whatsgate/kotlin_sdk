# io.swagger.client - Kotlin client library for API whatsgate.ru

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://whatsgate.ru/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**checkPost**](docs/DefaultApi.md#checkpost) | **POST** /check | Проверка зарегистрирован ли номер в WhatsApp
*DefaultApi* | [**getChatsPost**](docs/DefaultApi.md#getchatspost) | **POST** /get-chats | Возвращает список активных чатов
*DefaultApi* | [**seenPost**](docs/DefaultApi.md#seenpost) | **POST** /seen | Отправляет команду в чат, что последние сообщения просмотрены
*DefaultApi* | [**sendMessage**](docs/DefaultApi.md#sendmessage) | **POST** /send | Отправка сообщения
*_Api* | [**getMediaPost**](docs/_Api.md#getmediapost) | **POST** /get-media | Возвращает объект медиафайла, прикрепленного к сообщению

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.AnyOfseenBodyRecipient](docs/AnyOfseenBodyRecipient.md)
 - [io.swagger.client.models.AnyOfsendBodyMessage](docs/AnyOfsendBodyMessage.md)
 - [io.swagger.client.models.AnyOfsendBodyRecipient](docs/AnyOfsendBodyRecipient.md)
 - [io.swagger.client.models.CheckBody](docs/CheckBody.md)
 - [io.swagger.client.models.Error](docs/Error.md)
 - [io.swagger.client.models.GetchatsBody](docs/GetchatsBody.md)
 - [io.swagger.client.models.GetmediaBody](docs/GetmediaBody.md)
 - [io.swagger.client.models.InlineResponse200](docs/InlineResponse200.md)
 - [io.swagger.client.models.InlineResponse2001](docs/InlineResponse2001.md)
 - [io.swagger.client.models.InlineResponse2002](docs/InlineResponse2002.md)
 - [io.swagger.client.models.InlineResponse2003](docs/InlineResponse2003.md)
 - [io.swagger.client.models.InlineResponse2004](docs/InlineResponse2004.md)
 - [io.swagger.client.models.Media](docs/Media.md)
 - [io.swagger.client.models.MessageMedia](docs/MessageMedia.md)
 - [io.swagger.client.models.MessageText](docs/MessageText.md)
 - [io.swagger.client.models.OneOfinlineResponse200Result](docs/OneOfinlineResponse200Result.md)
 - [io.swagger.client.models.RecipientId](docs/RecipientId.md)
 - [io.swagger.client.models.RecipientNum](docs/RecipientNum.md)
 - [io.swagger.client.models.ResponseAsync](docs/ResponseAsync.md)
 - [io.swagger.client.models.ResponseChat](docs/ResponseChat.md)
 - [io.swagger.client.models.ResponseChatGroupMetadata](docs/ResponseChatGroupMetadata.md)
 - [io.swagger.client.models.ResponseChatGroupMetadataParticipants](docs/ResponseChatGroupMetadataParticipants.md)
 - [io.swagger.client.models.ResponseMessage](docs/ResponseMessage.md)
 - [io.swagger.client.models.SeenBody](docs/SeenBody.md)
 - [io.swagger.client.models.SendBody](docs/SendBody.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="ApiKeyAuth"></a>
### ApiKeyAuth


