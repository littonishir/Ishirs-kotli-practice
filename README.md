# Ishirs-kotli-practice
Ishir的kotlin修行

### 项目初始化

#### 仓库配置

在你的项目gradle中配置阿里云仓库(可以不配置).

但是 google() 仓库大家懂得.科学上网从我做起.

```groovy
  repositories {
        maven{
            url "http://maven.aliyun.com/nexus/content/groups/public"
        }
        google()
        jcenter()
    }
```

#### 忽略配置

.gitignore文件

```gitignore
#配置忽略文件
*.iml
.gradle
local.properties
.idea
.DS_Store
build
captures
.externalNativeBuild
```
