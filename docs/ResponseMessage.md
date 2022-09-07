# ResponseMessage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.String**](.md) | Идентификатор сообщения |  [optional]
**ack** | [**kotlin.Int**](.md) | Флаг просмотра сообщения |  [optional]
**hasMedia** | [**kotlin.Boolean**](.md) | Флаг, имеет ли сообщение медиафайл |  [optional]
**mediaKey** | [**kotlin.String**](.md) | Ключ медиафайла (при наличии) |  [optional]
**body** | [**kotlin.String**](.md) | Текст сообщения |  [optional]
**type** | [**kotlin.String**](.md) | Тип сообщения |  [optional]
**timestamp** | [**kotlin.Int**](.md) | Время сообщения в формате Unix Timestamp |  [optional]
**from** | [**kotlin.String**](.md) | Идентификатор отправителя в формате WhatsApp |  [optional]
**to** | [**kotlin.String**](.md) | Идентификатор получателя в формате WhatsApp |  [optional]
**isForwarded** | [**kotlin.Boolean**](.md) | Флаг, было ли сообщение перенаправлено |  [optional]
