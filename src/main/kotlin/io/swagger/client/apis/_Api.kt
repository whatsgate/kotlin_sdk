/**
 * API whatsgate.ru
 * Интерфейс для взаимодействия с клиентом Whatsapp
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.apis

import io.swagger.client.models.Error
import io.swagger.client.models.GetmediaBody
import io.swagger.client.models.InlineResponse2003

import io.swagger.client.infrastructure.*

class _Api(basePath: kotlin.String = "https://whatsgate.ru/v1") : ApiClient(basePath) {

    /**
     * Возвращает объект медиафайла, прикрепленного к сообщению
     * 
     * @param body Запрашивает и возвращает медиа-файл, прикрепленный к сообщению по идентификатору mediaKey. 
     * @return InlineResponse2003
     */
    @Suppress("UNCHECKED_CAST")
    fun getMediaPost(body: GetmediaBody): InlineResponse2003 {
        val localVariableBody: kotlin.Any? = body
        
        val localVariableConfig = RequestConfig(
                RequestMethod.POST,
                "/get-media"
        )
        val response = request<InlineResponse2003>(
                localVariableConfig, localVariableBody
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as InlineResponse2003
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}