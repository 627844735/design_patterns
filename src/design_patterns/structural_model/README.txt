该包中主要介绍 <结构型> 设计模式.
                1.<proxy> 代理模式：
                    <Food><ChickenFood><NoodleFood> 为食物类.
                    <MakeFood> 为主接口.  <MakeFoodImpl>为主实现类.  <MakeFoodImplProxy>为代理类.
                    代理模式主要解决 代码中横向切面的问题.  其中以Spring proxy为经典.

                2.<adapter> 适配器模式：
                    <default_adapter> 默认适配器模式.
                        有一个接口中有很多的方法,我们需要关注的方法只有其中几个. 我们就可以创建一个适配器[adapter]其中的方法都为空.
                        创建一个监视器[Monitor]派生自适配器实现我们关注的方法即可.

                    <object_adapter> 对象适配器
                        对象适配器模式主要解决： 老接口不符合现在需求,但代码不可改.又要符合新接口. 可以使用适配器模式.
                            1.老接口. Cock  -> 实现类 WilkCock
                            2.新接口. Duck  -> 适配器 DuckAdapter.  在适配器中有一个老接口属性, 构造函数中实例化属性. 在适配器中实现新接口中的方法套入老接口的方法.


                    <class_adapter> 类适配器
                        类适配器模式主要解决： 代码不符合规范,老代码没有接口. 只有一个类. 创建一个新接口中,接口中包含老类的方法和新方法. 适配器继承老类、实现新接口.
                            1.老类 SomeThing
                            2.新接口 Target ->  适配器 SomeThingAdapter. 继承老类和实现新接口.
                        