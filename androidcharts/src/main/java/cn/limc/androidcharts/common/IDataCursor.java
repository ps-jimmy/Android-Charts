/*
 * IDataCursor.java
 * Android-Charts
 *
 * Created by limc on 2014.
 *
 * Copyright 2011 limc.cn All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package cn.limc.androidcharts.common;


/**
 * <p>en</p>
 * <p>jp</p>
 * <p>cn</p>
 *
 * @author limc
 * @version v1.0 2014/06/18 15:54:24
 */
public interface IDataCursor {

    static final int MIN_DISPLAY_NUM = 20;
    static final int MAX_DISPLAY_NUM = 20;

    int getDisplayFrom();
    int getDisplayNumber();
    int getDisplayTo();
    int getMinDisplayNumber();
    int getMaxDisplayNumber();

    int getDataDisplayNumber();

    void setDisplayFrom(int displayFrom);

    void setDisplayNumber(int displayNumber);
    //void setDisplayTo(int displayTo);

    void setMinDisplayNumber(int minDisplayNumber);

    void setMaxDisplayNumber(int maxDisplayNumber);

    boolean forward(int step);

    boolean backward(int step);

    boolean stretch(int step);

    boolean shrink(int step);
}
