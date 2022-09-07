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
package io.swagger.client.models


/**
 * 
 * @param whatsappID Идентификатор Whatsapp ID
 * @param mediaKey Идентификатор медиафайла, содержится во входящих сообщениях.
 */
data class GetmediaBody (

    /* Идентификатор Whatsapp ID */
    val whatsappID: kotlin.String? = null,
    /* Идентификатор медиафайла, содержится во входящих сообщениях. */
    val mediaKey: kotlin.String? = null
) {
}