# Sensitive-Data-Collection-and-Analysis-Mechanism-with-Local-Differential-Privacy-Preservation
# 基于分布式差分隐私的敏感数据收集与分析技术
GitHub 仓库：基于分布式差分隐私的敏感数据收集与分析技术
## 🌟 项目概述
项目名称： 基于分布式差分隐私的敏感数据收集与分析技术

项目负责人： 秦湛

所属单位： 浙江大学

联系邮箱： qinzhan@zju.edu.cn
![image](https://github.com/user-attachments/assets/c46f557c-8ce5-460c-a3f5-4fdbe7b1376a)

## 📚 研究背景
在大数据时代，敏感数据的收集与分析在智慧城市、医疗健康和金融服务等领域的应用日益广泛。然而，传统密码学方法在数据隐私保护与数据可用性之间难以取得平衡。本项目旨在通过分布式差分隐私技术，解决这一难题，为大数据隐私保护提供创新性解决方案。
## 🔍 研究目标
- 多源异构数据保护：
构建多源异构数据的隐私量化模型与保护算法，实现对数值、符号、图等多种复杂数据类型的隐私保护。

- 复杂数据分析：
提出适用于图数据和深度学习任务的分布式差分隐私保护机制，通过多阶段自适应算法，提升数据分析的准确度与隐私保护强度。

- 多态数据保护：
设计动态与静态数据的隐私保护机制，通过多层次随机扰动与预算管理，平衡数据读写频率与隐私保护强度之间的关系。
## 📊 关键研究成果
### 1. 纵向联邦学习场景下的分布式差分隐私保护机制
论文： OpBoost: A Vertical Federated Tree Boosting Framework Based on Order-Preserving Desensitization

发表于： VLDB 2022 (CCF A类)

亮点：
在预测准确性方面显著优于相关方案。
在通信和计算开销上比传统保序加密方案提速40到200倍。
### 2. 基于虚拟点混洗模型增强的分布式差分隐私保护机制
论文： Privacy Enhancement via Dummy Points in the Shuffle Model

发表于： IEEE TDSC 2023 (CCF A类)

亮点：
通过增加虚拟点数量，隐私预算可以任意接近0。
协议的通信开销随着分布式系统中用户数量的增加而减少。
### 3. 针对无限数据流的分布式差分隐私保护机制
论文： DPI: Ensuring Strict Differential Privacy for Infinite Data Streaming

发表于： IEEE S&P 2024 (CCF A类)

亮点：
在统计查询、异常检测和推荐系统等任务中表现出更高的准确性。
有效解决了无限数据流中的隐私泄露问题。
### 4. 内存资源受限场景下的流数据高频项检测机制
论文： Local Differentially Private Heavy Hitter Detection in Data Streams with Bounded Memory Consumption

发表于： SIGMOD 2024 (CCF A类)

亮点：
在有限的内存下保持了较高的准确性。
在数据域大小为41,270的数据流上，节约了约2300倍的内存空间。
### 5. 面向联邦知识图谱嵌入的分布式差分隐私保护方法
论文： Quantifying and Defending Against Privacy Threats on Federated Knowledge Graph Embedding

发表于： WWW 2023 (CCF A类)

亮点：
将成员推理攻击的成功率从83.1%降低到59.4%，且对模型精度的影响很小。
### 6. 面向联邦知识图谱嵌入的个性化差分隐私防御机制
论文： Privacy Risks of Federated Knowledge Graph Embedding: New Membership Inference Attacks and Personalized Differential Privacy Defense

发表于： IEEE TDSC 2024 (CCF A类)

亮点：
将攻击成功率降低到60%以下，同时保持了良好的模型效用。
### 7. 延迟优化的分布式差分隐私数据流发布机制
论文： Delay-Allowed Differentially Private Data Stream Release

发表于： NDSS 2025 (CCF A类)

亮点：
在长度为18,319的数据流中，允许10个时间戳的延迟，相比基线方法在准确性上提高了多达30倍。
### 8. 分布式w-事件型差分隐私数据流持续发布方法
论文： SPAS: Continuous Release of Data Streams under w-Event Differential Privacy

发表于： SIGMOD 2025 (CCF A类)

亮点：
在所有数据集上，SPAS的误差最小，性能明显优于其他方法。
### 9. 面向极小极大机器学习模型的可证明数据遗忘隐私保护方法
论文： Certified Minimax Unlearning with Generalization Rates and Deletion Capacity

发表于： NeurIPS 2023 (CCF A类)

亮点：
在保证模型泛化能力的前提下，实现了可证明的数据遗忘。
### 10. 面向加密数据存储信息泄露的可调缓解隐私保护方法
论文： SWAT: A System-Wide Approach to Tunable Leakage Mitigation in Encrypted Data Stores

发表于： VLDB 2024 (CCF A类)

亮点：
在性能上比仅缓解特定泄漏类型的方案更具竞争力。
## 📝 论文成果列表
### 2022年：
- OpBoost: A Vertical Federated Tree Boosting Framework Based on Order-Preserving Desensitization (VLDB 2022, CCF A类)

- Privacy Enhancement via Dummy Points in the Shuffle Model (IEEE TDSC 2023, CCF A类)
### 2023年：
- DPI: Ensuring Strict Differential Privacy for Infinite Data Streaming (IEEE S&P 2024, CCF A类)

- Local Differentially Private Heavy Hitter Detection in Data Streams with Bounded Memory Consumption (SIGMOD 2024, CCF A类)

- Quantifying and Defending Against Privacy Threats on Federated Knowledge Graph Embedding (WWW 2023, CCF A类)
### 2024年：
- Privacy Risks of Federated Knowledge Graph Embedding: New Membership Inference Attacks and Personalized Differential Privacy Defense (IEEE TDSC 2024, CCF A类)

- Delay-Allowed Differentially Private Data Stream Release (NDSS 2025, CCF A类)

- SPAS: Continuous Release of Data Streams under w-Event Differential Privacy (SIGMOD 2025, CCF A类)

- Certified Minimax Unlearning with Generalization Rates and Deletion Capacity (NeurIPS 2023, CCF A类)

- SWAT: A System-Wide Approach to Tunable Leakage Mitigation in Encrypted Data Stores (VLDB 2024, CCF A类)
## 🌐 实际应用
金融服务：在保护敏感金融交易数据的同时，维护数据的可用性，用于风险评估和欺诈检测。

医疗健康：在远程医疗应用中保护患者数据，同时支持疾病预测和治疗计划的数据分析。

智慧城市：在智慧城市项目中保护交通流量和公共安全数据，支持跨部门数据共享和联合分析。
## 📢 加入我们
我们始终欢迎有才华的研究人员和开发人员加入我们的团队。如果您对差分隐私、数据安全和大数据分析感兴趣，请随时联系我们！
## 📖 引用
如果您觉得我们的工作对您有帮助，请考虑引用我们的论文。完整的论文列表请参见论文成果列表部分。

感谢您对我们的项目感兴趣！🚀
