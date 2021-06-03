/**
* ORY Hydra
* Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
*
* The version of the OpenAPI document: latest
*
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package sh.ory.hydra.model

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * Volume volume
 * @param driver Name of the volume driver used by the volume.
 * @param labels User-defined key/value metadata.
 * @param mountpoint Mount path of the volume on the host.
 * @param name Name of the volume.
 * @param options The driver specific options used when creating the volume.
 * @param scope The level at which the volume exists. Either `global` for cluster-wide, or `local` for machine level.
 * @param createdAt Date/Time the volume was created.
 * @param status Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: `{\"key\":\"value\",\"key2\":\"value2\"}`.  The `Status` field is optional, and is omitted if the volume driver does not support this feature.
 * @param usageData
 */

data class Volume(
    /* Name of the volume driver used by the volume. */
    @field:JsonProperty("Driver")
    val driver: kotlin.String,
    /* User-defined key/value metadata. */
    @field:JsonProperty("Labels")
    val labels: kotlin.collections.Map<kotlin.String, kotlin.String>,
    /* Mount path of the volume on the host. */
    @field:JsonProperty("Mountpoint")
    val mountpoint: kotlin.String,
    /* Name of the volume. */
    @field:JsonProperty("Name")
    val name: kotlin.String,
    /* The driver specific options used when creating the volume. */
    @field:JsonProperty("Options")
    val options: kotlin.collections.Map<kotlin.String, kotlin.String>,
    /* The level at which the volume exists. Either `global` for cluster-wide, or `local` for machine level. */
    @field:JsonProperty("Scope")
    val scope: kotlin.String,
    /* Date/Time the volume was created. */
    @field:JsonProperty("CreatedAt")
    val createdAt: kotlin.String? = null,
    /* Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: `{\"key\":\"value\",\"key2\":\"value2\"}`.  The `Status` field is optional, and is omitted if the volume driver does not support this feature. */
    @field:JsonProperty("Status")
    val status: kotlin.Any? = null,
    @field:JsonProperty("UsageData")
    val usageData: VolumeUsageData? = null
)
