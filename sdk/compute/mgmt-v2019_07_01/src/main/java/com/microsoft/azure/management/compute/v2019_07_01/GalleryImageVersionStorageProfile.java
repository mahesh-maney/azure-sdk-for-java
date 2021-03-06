/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This is the storage profile of a Gallery Image Version.
 */
public class GalleryImageVersionStorageProfile {
    /**
     * The source property.
     */
    @JsonProperty(value = "source")
    private GalleryArtifactVersionSource source;

    /**
     * The osDiskImage property.
     */
    @JsonProperty(value = "osDiskImage")
    private GalleryOSDiskImage osDiskImage;

    /**
     * A list of data disk images.
     */
    @JsonProperty(value = "dataDiskImages")
    private List<GalleryDataDiskImage> dataDiskImages;

    /**
     * Get the source value.
     *
     * @return the source value
     */
    public GalleryArtifactVersionSource source() {
        return this.source;
    }

    /**
     * Set the source value.
     *
     * @param source the source value to set
     * @return the GalleryImageVersionStorageProfile object itself.
     */
    public GalleryImageVersionStorageProfile withSource(GalleryArtifactVersionSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the osDiskImage value.
     *
     * @return the osDiskImage value
     */
    public GalleryOSDiskImage osDiskImage() {
        return this.osDiskImage;
    }

    /**
     * Set the osDiskImage value.
     *
     * @param osDiskImage the osDiskImage value to set
     * @return the GalleryImageVersionStorageProfile object itself.
     */
    public GalleryImageVersionStorageProfile withOsDiskImage(GalleryOSDiskImage osDiskImage) {
        this.osDiskImage = osDiskImage;
        return this;
    }

    /**
     * Get a list of data disk images.
     *
     * @return the dataDiskImages value
     */
    public List<GalleryDataDiskImage> dataDiskImages() {
        return this.dataDiskImages;
    }

    /**
     * Set a list of data disk images.
     *
     * @param dataDiskImages the dataDiskImages value to set
     * @return the GalleryImageVersionStorageProfile object itself.
     */
    public GalleryImageVersionStorageProfile withDataDiskImages(List<GalleryDataDiskImage> dataDiskImages) {
        this.dataDiskImages = dataDiskImages;
        return this;
    }

}
