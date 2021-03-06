/**
 * Copyright 2004-2048 .
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
package com.ipd.jsf.worker.common;

/**
 * worker执行器
 *
 */
public interface WorkerProcessor {


    /**
     * 停止worker处理
     *
     * @param isExecuteWorkerDestroy 是否需要执行worker的destroy方法
     */
    void stopProcess(boolean isExecuteWorkerDestroy);

    /**
     * 开始worker处理
     *
     */
    void startProcess();


    /**
     * 执行worker业务
     *
     */
    void process();


    /**
     * 是否在处理worker
     *
     * @return
     */
    boolean isProcessing();

}

