# BackEndCore
## package分層概述
#### control
第一層，負責與前端溝通，會把前端資料轉成物件調用特定module再回傳至前端

#### module
第二層，負責調用databaseaccessobject取得資料並運算，回傳資料給control

#### databaseaccessobject
第三層，負責將資料庫拿取的資料轉換為物件

#### database
第四層，負責與資料庫進行溝通

#### object
存放所有物件之資料夾

#### systemtool
系統工具