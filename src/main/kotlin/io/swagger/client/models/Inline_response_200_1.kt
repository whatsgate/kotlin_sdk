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
 * @param result при удачном исполнении запроса содержит OK
 * @param &#x60;data&#x60; результат проверки, true - зарегистрирован.
 */
data class InlineResponse2001 (

    /* при удачном исполнении запроса содержит OK */
    val result: kotlin.String? = null,
    /* результат проверки, true - зарегистрирован. */
    val `data`: kotlin.Boolean? = null
) {
}