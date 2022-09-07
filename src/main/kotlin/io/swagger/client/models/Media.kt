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
 * @param mimetype Mime type of file
 * @param &#x60;data&#x60; Base64 encoded data file body
 * @param filename Name of the file
 */
data class Media (

    /* Mime type of file */
    val mimetype: Media.Mimetype,
    /* Base64 encoded data file body */
    val `data`: kotlin.String,
    /* Name of the file */
    val filename: kotlin.String
) {
    /**
    * Mime type of file
    * Values: APPLICATIONSLASHOGG,APPLICATIONSLASHPDF,APPLICATIONSLASHZIP,APPLICATIONSLASHGZIP,APPLICATIONSLASHMSWORD,AUDIOSLASHMP4,AUDIOSLASHAAC,AUDIOSLASHMPEG,AUDIOSLASHOGG,AUDIOSLASHWEBM,IMAGESLASHGIF,IMAGESLASHJPEG,IMAGESLASHPJPEG,IMAGESLASHPNG,IMAGESLASHSVGPLUSXML,IMAGESLASHTIFF,IMAGESLASHWEBP,VIDEOSLASHMPEG,VIDEOSLASHMP4,VIDEOSLASHOGG,VIDEOSLASHQUICKTIME,VIDEOSLASHWEBM,VIDEOSLASHXMSWMV,VIDEOSLASHXFLV,APPLICATIONSLASHVNDPERIODMSEXCEL,APPLICATIONSLASHVNDPERIODMSPOWERPOINT,APPLICATIONSLASHMSWORD_26
    */
    enum class Mimetype(val value: kotlin.String){
        APPLICATIONSLASHOGG("application/ogg"),
        APPLICATIONSLASHPDF("application/pdf"),
        APPLICATIONSLASHZIP("application/zip"),
        APPLICATIONSLASHGZIP("application/gzip"),
        APPLICATIONSLASHMSWORD("application/msword"),
        AUDIOSLASHMP4("audio/mp4"),
        AUDIOSLASHAAC("audio/aac"),
        AUDIOSLASHMPEG("audio/mpeg"),
        AUDIOSLASHOGG("audio/ogg"),
        AUDIOSLASHWEBM("audio/webm"),
        IMAGESLASHGIF("image/gif"),
        IMAGESLASHJPEG("image/jpeg"),
        IMAGESLASHPJPEG("image/pjpeg"),
        IMAGESLASHPNG("image/png"),
        IMAGESLASHSVGPLUSXML("image/svg+xml"),
        IMAGESLASHTIFF("image/tiff"),
        IMAGESLASHWEBP("image/webp"),
        VIDEOSLASHMPEG("video/mpeg"),
        VIDEOSLASHMP4("video/mp4"),
        VIDEOSLASHOGG("video/ogg"),
        VIDEOSLASHQUICKTIME("video/quicktime"),
        VIDEOSLASHWEBM("video/webm"),
        VIDEOSLASHXMSWMV("video/x-ms-wmv"),
        VIDEOSLASHXFLV("video/x-flv"),
        APPLICATIONSLASHVNDPERIODMSEXCEL("application/vnd.ms-excel"),
        APPLICATIONSLASHVNDPERIODMSPOWERPOINT("application/vnd.ms-powerpoint"),
        APPLICATIONSLASHMSWORD_26("application/msword");
    }
}