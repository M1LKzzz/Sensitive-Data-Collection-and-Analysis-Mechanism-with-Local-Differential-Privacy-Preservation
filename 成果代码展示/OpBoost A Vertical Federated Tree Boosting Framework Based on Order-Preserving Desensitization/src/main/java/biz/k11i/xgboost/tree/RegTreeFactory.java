/*
 * Original Work Copyright 2018 H2O.ai.
 * Modified by Weiran Liu. Adjust the code based on Alibaba Java Code Guidelines.
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
package biz.k11i.xgboost.tree;

import biz.k11i.xgboost.util.ModelReader;

import java.io.IOException;

/**
 * Regression tree factory.
 *
 * @author Michal Kurka, Weiran Liu
 * @date 2021/10/08
 */
public interface RegTreeFactory {

  /**
   * Loads tree from the reader.
   *
   * @param reader model reader.
   * @return loaded tree.
   * @throws IOException If an I/O error occurs.
   */
  RegTree loadTree(ModelReader reader) throws IOException;

}
