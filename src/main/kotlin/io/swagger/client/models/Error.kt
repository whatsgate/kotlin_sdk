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
 * @param name Наименование ошибки
 * @param message Текст ошибки
 * @param code 
 * @param status 
 */
data class Error (

    /* Наименование ошибки */
    val name: kotlin.String? = null,
    /* Текст ошибки */
    val message: kotlin.String? = null,
    val code: kotlin.Int? = null,
    val status: kotlin.Int? = null
) {
}