/*
 * Copyright © Yan Zhenjie. All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.caimuhao.rxpicker.bean;

import java.io.Serializable;
import java.util.ArrayList;

/**
 */
public class MediaFolder implements Serializable {

  private int id;
  /**
   * Folder name.
   */
  private String name;
  /**
   * Image list in folder.
   */
  private ArrayList<MediaItem> images = new ArrayList<>();
  /**
   * checked.
   */
  private boolean isChecked;

  public MediaFolder() {
    super();
  }

  public MediaFolder(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<MediaItem> getImages() {
    return images;
  }

  public void addPhoto(MediaItem photo) {
    this.images.add(photo);
  }

  public boolean isChecked() {
    return isChecked;
  }

  public void setChecked(boolean checked) {
    isChecked = checked;
  }
}