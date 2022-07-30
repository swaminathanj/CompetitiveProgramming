Aum Amma

# Design Pattern Detection

<table>
  <tr>
    <th>Design Pattern</th>
    <th>Example<br>Scenario</th>
    <th>Program<br>(Source code)</th>
    <th>Execution<br>Trace</th>
    <th>Augmented<br>Call tree</th>
    <th>Highlighted<br>Sequence diagram</th>
  </tr>
  <tr>
    <td>Abstract Factory</td>
    <td>Gourmet PizzaFactory</td>
    <td>
      <a href="abstractfactory/BasePizzaFactory.java">BasePizzaFactory.javaa</a><br>
      <a href="abstractfactory/BaseToppingFactory.java">BaseToppingFactory.java</a><br>
      <a href="abstractfactory/CaliforniaOilSauce.java">CaliforniaOilSauce.java</a><br>
      <a href="abstractfactory/Cheese.java">Cheese.java</a><br>
      <a href="abstractfactory/CheesePizza.java">CheesePizza.java</a><br>
      <a href="abstractfactory/GoatCheese.java">GoatCheese.javaa</a><br>
      <a href="abstractfactory/GourmetPizzaFactory.java">GourmetPizzaFactory.java</a><br>
      <a href="abstractfactory/GourmetPizzaFactoryTest.java">GourmetPizzaFactoryTest.java</a><br>
      <a href="abstractfactory/GourmetToppingFactory.java">GourmetToppingFactory.java</a><br>
      <a href="abstractfactory/MozzarellaCheese.java">MozzarellaCheese.java</a><br>
      <a href="abstractfactory/PepperoniPizza.java">PepperoniPizza.java</a><br>
      <a href="abstractfactory/Pizza.java">Pizza.java</a><br>
      <a href="abstractfactory/Sauce.java">Sauce.java</a><br>
      <a href="abstractfactory/SicilianPizzaFactory.java">SicilianPizzaFactory.java</a><br>
      <a href="abstractfactory/SicilianToppingFactory.java">SicilianToppingFactory.java</a><br>
      <a href="abstractfactory/TomatoSauce.java">TomatoSauce.java</a><br>
      <a href="abstractfactory/VeggiePizza.java">VeggiePizza.java</a><br>
    </td>
    <td><a href="abstractfactory/trace.csv">trace.csv</a></td>
    <td><a href="abstractfactory/calltree.png">calltree.png</a> <br> <a href="abstractfactory/calltree_dp.png">calltree_dp.png</a></td>
    <td><a href="abstractfactory/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Adapter</td>
    <td>Bird Demo</td>
    <td>
      <a href="adapter/CsvAdapterImpl.java">CsvAdapterImpl.java</a><br>
      <a href="adapter/CsvFormattable.java">CsvFormattable.java</a><br>
      <a href="adapter/CsvFormatter.java">CsvFormatter.java</a><br>
      <a href="adapter/NewLineFormatter.java">NewLineFormatter.java</a><br>
      <a href="adapter/NewLineFormatterTest.java">NewLineFormatterTest.java</a><br>
      <a href="adapter/TextFormattable.java">TextFormattable.java</a><br>
      <a href="adapter/Readme.md">Readme</a><br>
    </td>
    <td><a href="adapter/trace.csv">trace.csv</a></td>
    <td><a href="adapter/calltree.png">calltree.png</a> <br> <a href="adapter/calltree_dp.png">calltree_dp.png</a></td>
    <td><a href="adapter/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Bridge</td>
    <td>Message</td>
    <td>
      <a href="bridge/EmailMessage.java">EmailMessage.java</a><br>
      <a href="bridge/EmailMessageSender.java">EmailMessageSender.java</a><br>
      <a href="bridge/Message.java">Message.java</a><br>
      <a href="bridge/MessageSender.java">MessageSender.java</a><br>
      <a href="bridge/MessageTest.java">MessageTest.java</a><br>
      <a href="bridge/TextMessage.java">TextMessage.java</a><br>
      <a href="bridge/TextMessageSender.java">TextMessageSender.java</a><br>
    </td>
    <td><a href="bridge/trace.csv">trace.csv</a></td>
    <td><a href="bridge/calltree.png">calltree.png</a> <br> <a href="bridge/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="bridge/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Builder</td>
    <td>Construction House</td>
    <td>
      <a href="builder/ConcreteHouseBuilder.java">ConcreteHouseBuilder.java</a><br>
      <a href="builder/ConstructionEngineer.java">ConstructionEngineer.java</a><br>
      <a href="builder/ConstructionEngineerTest.java">ConstructionEngineerTest.java</a><br>
      <a href="builder/House.java">House.java</a><br>
      <a href="builder/HouseBuilder.java">HouseBuilder.java</a><br>
      <a href="builder/PrefabricatedHouseBuilder.java">PrefabricatedHouseBuilder.java</a><br>
    </td>
    <td><a href="builder/trace.csv">trace.csv</a></td>
    <td><a href="builder/calltree.png">calltree.png</a> <br> <a href="builder/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="builder/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Chain of Responsibility</td>
    <td>Example</td>
    <td>
      <a href="chainofresp/First.java">First.java</a><br>
      <a href="chainofresp/Second.java">Second.java</a><br>
      <a href="chainofresp/Third.java">Third.java</a><br>
      <a href="chainofresp/Fourth.java">Fourth.java</a><br>
    </td>
    <td><a href="chainofresp/trace.csv">trace.csv</a></td>
    <td><a href="chainofresp/calltree.png">calltree.png</a></td>
    <td><a href="chainofresp/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Command</td>
    <td>Example</td>
    <td>
      <a href="command/First.java">First.java</a><br>
      <a href="command/Second.java">Second.java</a><br>
      <a href="command/Third.java">Third.java</a><br>
      <a href="command/Fourth.java">Fourth.java</a><br>
    </td>
    <td><a href="command/trace.csv">trace.csv</a></td>
    <td><a href="command/calltree.png">calltree.png</a></td>
    <td><a href="command/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Composite</td>
    <td>Catalog</td>
    <td>
      <a href="composite/CatalogComponent.java">CatalogComponent.java</a><br>
      <a href="composite/Composite_Catalog.java">Composite_Catalog.java</a><br>
      <a href="composite/Product.java">Product.java</a><br>
      <a href="composite/ProductCatalog.java">ProductCatalog.java</a><br>
    </td>
    <td><a href="composite/trace.csv">trace.csv</a></td>
    <td><a href="composite/calltree.png">calltree.png</a> <br> <a href="composite/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="composite/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Decorator</td>
    <td>Flower Bouquet</td>
    <td>
      <a href="decorator/FlowerBouquet.java">FlowerBouquet.java</a><br>
      <a href="decorator/FlowerBouquetDecorator.java">FlowerBouquetDecorator.java</a><br>
      <a href="decorator/Flower_Bouquet_Test.java">Flower_Bouquet_Test.java</a><br>
      <a href="decorator/Glitter.java">Glitter.java</a><br>
      <a href="decorator/OrchidBouquet.java">OrchidBouquet.java</a><br>
      <a href="decorator/PaperWrapper.java">PaperWrapper.java</a><br>
      <a href="decorator/RibbonBow.java">RibbonBow.java</a><br>
      <a href="decorator/RoseBouquet.java">RoseBouquet.java</a><br>
    </td>
    <td><a href="decorator/trace.csv">trace.csv</a></td>
    <td><a href="decorator/calltree.png">calltree.png</a> <br> <a href="decorator/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="decorator/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Facade</td>
    <td>Example</td>
    <td>
      <a href="facade/First.java">First.java</a><br>
      <a href="facade/Second.java">Second.java</a><br>
      <a href="facade/Third.java">Third.java</a><br>
      <a href="facade/Fourth.java">Fourth.java</a><br>
    </td>
    <td><a href="facade/trace.csv">trace.csv</a></td>
    <td><a href="facade/calltree.png">calltree.png</a></td>
    <td><a href="facade/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Factory Method</td>
    <td>Pizza Factory</td>
    <td>
      <a href="factorymethod/BasePizzaFactory.java">BasePizzaFactory.java</a><br>
      <a href="factorymethod/CheesePizza.java">CheesePizza.java</a><br>
      <a href="factorymethod/PepperoniPizza.java">PepperoniPizza.java</a><br>
      <a href="factorymethod/Pizza.java">Pizza.java</a><br>
      <a href="factorymethod/PizzaFactory.java">PizzaFactory.javaa</a><br>
      <a href="factorymethod/PizzaFactoryTest.java">PizzaFactoryTest.java</a><br>
      <a href="factorymethod/VeggiePizza.java">VeggiePizza.java</a><br>
    </td>
    <td><a href="factorymethod/trace.csv">trace.csv</a></td>
    <td><a href="factorymethod/calltree.png">calltree.png</a> <br> <a href="factorymethod/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="factorymethod/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Flyweight</td>
    <td>Example</td>
    <td>
      <a href="flyweight/First.java">First.java</a><br>
      <a href="flyweight/Second.java">Second.java</a><br>
      <a href="flyweight/Third.java">Third.java</a><br>
      <a href="flyweight/Fourth.java">Fourth.java</a><br>
    </td>
    <td><a href="flyweight/trace.csv">trace.csv</a></td>
    <td><a href="flyweight/calltree.png">calltree.png</a></td>
    <td><a href="flyweight/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Interpreter</td>
    <td>Example</td>
    <td>
      <a href="interpreter/First.java">First.java</a><br>
      <a href="interpreter/Second.java">Second.java</a><br>
      <a href="interpreter/Third.java">Third.java</a><br>
      <a href="interpreter/Fourth.java">Fourth.java</a><br>
    </td>
    <td><a href="interpreter/trace.csv">trace.csv</a></td>
    <td><a href="interpreter/calltree.png">calltree.png</a></td>
    <td><a href="interpreter/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Iterator</td>
    <td>Example</td>
    <td>
      <a href="iterator/First.java">First.java</a><br>
      <a href="iterator/Second.java">Second.java</a><br>
      <a href="iterator/Third.java">Third.java</a><br>
      <a href="iterator/Fourth.java">Fourth.java</a><br>
    </td>
    <td><a href="iterator/trace.csv">trace.csv</a></td>
    <td><a href="iterator/calltree.png">calltree.png</a></td>
    <td><a href="iterator/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Mediator</td>
    <td>Example</td>
    <td>
      <a href="mediator/First.java">First.java</a><br>
      <a href="mediator/Second.java">Second.java</a><br>
      <a href="mediator/Third.java">Third.java</a><br>
      <a href="mediator/Fourth.java">Fourth.java</a><br>
    </td>
    <td><a href="mediator/trace.csv">trace.csv</a></td>
    <td><a href="mediator/calltree.png">calltree.png</a></td>
    <td><a href="mediator/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Memento</td>
    <td>Employee Orginator</td>
    <td>
      <a href="memento/EmpCaretaker.java">EmpCaretaker.java</a><br>
      <a href="memento/EmpMemento.java">EmpMemento.java</a><br>
      <a href="memento/EmpOriginator.java">EmpOriginator.java</a><br>
      <a href="memento/EmpOriginatorTest.java">EmpOriginatorTest.java</a><br>
    </td>
    <td><a href="memento/trace.csv">trace.csv</a></td>
    <td><a href="memento/calltree.png">calltree.png</a> <br> <a href="memento/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="memento/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Observer</td>
    <td>Product Bidder</td>
    <td>
      <a href="observer/Bidder.java">Bidder.java</a><br>
      <a href="observer/Observer.java">Observer.java</a><br>
      <a href="observer/ObserverTest.java">ObserverTest.java</a><br>
      <a href="observer/Product.java">Product.java</a><br>
      <a href="observer/Subject.java">Subject.java</a><br>
    </td>
    <td><a href="observer/trace.csv">trace.csv</a></td>
    <td><a href="observer/calltree.png">calltree.png</a> <br> <a href="observer/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="observer/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Prototype</td>
    <td>Document Prototype</td>
    <td>
      <a href="prototype/AuthorizedSignatory.java">AuthorizedSignatory.java</a><br>
      <a href="prototype/DocumentPrototypeManager.java">DocumentPrototypeManager.java</a><br>
      <a href="prototype/DocumentPrototypeManagerTest.java">DocumentPrototypeManagerTest.java</a><br>
      <a href="prototype/NDAgreement.java">NDAgreement.java</a><br>
      <a href="prototype/PrototypeCapableDocument.java">PrototypeCapableDocument.java</a><br>
      <a href="prototype/TAndC.java">TAndC.java</a><br>
    </td>
    <td><a href="prototype/trace.csv">trace.csv</a></td>
    <td><a href="prototype/calltree.png">calltree.png</a> <br> <a href="prototype/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="prototype/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Proxy</td>
    <td>Report Generator</td>
    <td>
      <a href="proxy/ReportGenerator.java">ReportGenerator.java</a><br>
      <a href="proxy/ReportGeneratorImpl.java">ReportGeneratorImpl.java</a><br>
      <a href="proxy/ReportGeneratorImplProxy.java">ReportGeneratorImplProxy.java</a><br>
      <a href="proxy/ReportGeneratorImplProxyTest.java">ReportGeneratorImplProxyTest.java</a><br>
      <a href="proxy/Role.java">Role.java</a><br>
    </td>
    <td><a href="proxy/trace.csv">trace.csv</a></td>
    <td><a href="proxy/calltree.png">calltree.png</a> <br> <a href="proxy/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="proxy/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Singleton</td>
    <td>Singleton Demo</td>
    <td>
      <a href="singleton/SingleObject.java">SingleObject.java</a><br>
      <a href="singleton/SingletonPatternDemo.java">SingletonPatternDemo.java</a><br>
    </td>
    <td><a href="singleton/trace.csv">trace.csv</a></td>
    <td><a href="singleton/calltree.png">calltree.png</a> <br> <a href="singleton/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="singleton/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>State</td>
    <td>VendingMachine</td>
    <td>
      <a href="state/CandyVendingMachine.java">CandyVendingMachine.java</a><br>
      <a href="state/CandyVendingMachineState.java">CandyVendingMachineState.java</a><br>
      <a href="state/CandyVendingMachineTest.java">CandyVendingMachineTest.java</a><br>
      <a href="state/ContainsCoinState.java">ContainsCoinState.java</a><br>
      <a href="state/DispensedState.java">DispensedState.java</a><br>
      <a href="state/NoCandyState.java">NoCandyState.java</a><br>
      <a href="state/NoCoinState.java">NoCoinState.java</a><br>
    </td>
    <td><a href="state/trace.csv">trace.csv</a></td>
    <td><a href="state/calltree.png">calltree.png</a> <br> <a href="state/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="state/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Strategy</td>
    <td>Encryptor</td>
    <td>
      <a href="strategy/AesEncryptionStrategy.java">AesEncryptionStrategy.java</a><br>
      <a href="strategy/BlowfishEncryptionStrategy.java">BlowfishEncryptionStrategy.java</a><br>
      <a href="strategy/EncryptionStrategy.java">EncryptionStrategy.java</a><br>
      <a href="strategy/Encryptor.java">Encryptor.java</a><br>
      <a href="strategy/EncryptorTest.java">EncryptorTest.java</a><br>
    </td>
    <td><a href="strategy/trace.csv">trace.csv</a></td>
    <td><a href="strategy/calltree.png">calltree.png</a> <br> <a href="strategy/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="strategy/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Template Method</td>
    <td>Pizza Maker</td>
    <td>
      <a href="template/InHouseAssortedPizzaMaker.java">InHouseAssortedPizzaMaker.java</a><br>
      <a href="template/NonVegPizzaMaker.java">NonVegPizzaMaker.java</a><br>
      <a href="template/PizzaMaker.java">PizzaMaker.java</a><br>
      <a href="template/PizzaMakerTest.java">PizzaMakerTest.java</a><br>
      <a href="template/VegPizzaMaker.java">VegPizzaMaker.java</a><br>
    </td>
    <td><a href="template/trace.csv">trace.csv</a></td>
    <td><a href="template/calltree.png">calltree.png</a> <br> <a href="template/calltree_dp.png">calltree_dp.png</a></td>
    <td><a href="template/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Visitor</td>
    <td>Mail Client Visitor</td>
    <td>
      <a href="visitor/LinuxMailClientVisitor.java">LinuxMailClientVisitor.java</a><br>
      <a href="visitor/MacMailClientVisitor.java">MacMailClientVisitor.java</a><br>
      <a href="visitor/MailClient.java">MailClient.java</a><br>
      <a href="visitor/MailClientVisitor.java">MailClientVisitor.java</a><br>
      <a href="visitor/MailClientVisitorTest.java">MailClientVisitorTest.java</a><br>
      <a href="visitor/OperaMailClient.java">OperaMailClient.java</a><br>
      <a href="visitor/SquirrelMailClient.java">SquirrelMailClient.java</a><br>
      <a href="visitor/WindowsMailClientVisitor.java">WindowsMailClientVisitor.java</a><br>
      <a href="visitor/ZimbraMailClient.java">ZimbraMailClient.java</a><br>
    </td>
    <td><a href="visitor/trace.csv">trace.csv</a></td>
    <td><a href="visitor/calltree.png">calltree.png</a> <br> <a href="visitor/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="visitor/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
</table>
