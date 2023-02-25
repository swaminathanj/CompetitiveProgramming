<p style='color.white'>Aum Amriteswaryai Namah</p>

# Design Pattern Detection

The table below provides the complete details of experiments carried out for design pattern detection based on our approach. Please visit the [JHotDraw Case Study](CaseStudy/JHotDraw5.1) for the results of large open source case study.

<table>
  <tr>
    <th>Design Pattern</th>
    <th>Representative<br>Example</th>
    <th>Program<br>(Source code)</th>
    <th>Execution<br>Trace</th>
    <th>Augmented<br>Call tree</th>
    <th>Highlighted<br>Sequence diagram</th>
  </tr>
  <tr>
    <td>Abstract Factory <br> <a href="abstractfactory/OtherExamples">(5 more examples)</a></td>
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
    <td>Csv Adapter</td>
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
    <td>Logger</td>
    <td>
      <a href="chainofresp/ChainOfResponsibilityClient.java">ChainOfResponsibilityClient.java</a><br>
      <a href="chainofresp/ConsoleBasedLogger.java">ConsoleBasedLogger.java</a><br>
      <a href="chainofresp/DebugBasedLogger.java">DebugBasedLogger.java</a><br>
      <a href="chainofresp/ErrorBasedLogger.java">ErrorBasedLogger.java</a><br>
      <a href="chainofresp/Logger.java">Logger.java</a><br>
      <a href="chainofresp/RequestorClient.java">RequestorClient.java</a><br>
    </td>
    <td><a href="chainofresp/trace.csv">trace.csv</a></td>
    <td><a href="chainofresp/calltree.png">calltree.png</a> <br> <a href="chainofresp/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="chainofresp/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Command</td>
    <td>Remote Control</td>
    <td>
      <a href="command/Car.java">Car.java</a><br>
      <a href="command/CarMoveCommand.java">CarMoveCommand.java</a><br>
      <a href="command/CarStopCommand.java">CarStopCommand.java</a><br>
      <a href="command/CommandBase.java">CommandBase.java</a><br>
      <a href="command/RemoteControl.java">RemoteControl.java</a><br>
      <a href="command/RemoteControlTest.java">RemoteControlTest.java</a><br>
      <a href="command/RotatingTop.java">RotatingTop.java</a><br>
      <a href="command/TopRotateCommand.java">TopRotateCommand.java</a><br>
      <a href="command/TopStopRotateCommand.java">TopStopRotateCommand.java</a><br>
    </td>
    <td><a href="command/trace.csv">trace.csv</a></td>
    <td><a href="command/calltree.png">calltree.png</a> <br> <a href="command/calltree_dp.png">calltree_dp.png</a> </td>
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
    <td>Order Controller</td>
    <td>
      <a href="facade/InventoryService.java">InventoryService.java</a><br>
      <a href="facade/OrderFulfillmentController.java">OrderFulfillmentController.java</a><br>
      <a href="facade/OrderFulfillmentControllerTest.java">OrderFulfillmentControllerTest.java</a><br>
      <a href="facade/OrderServiceFacade.java">OrderServiceFacade.java</a><br>
      <a href="facade/OrderServiceFacadeImpl.java">OrderServiceFacadeImpl.java</a><br>
      <a href="facade/PaymentService.java">PaymentService.java</a><br>
      <a href="facade/Product.java">Product.java</a><br>
      <a href="facade/ShippingService.java">ShippingService.java</a><br>
    </td>
    <td><a href="facade/trace.csv">trace.csv</a></td>
    <td><a href="facade/calltree.png">calltree.png</a> <br> <a href="facade/calltree_dp.png">calltree_dp.png</a> </td>
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
    <td>Race Car</td>
    <td>
      <a href="flyweight/CarFactory.java">CarFactory.java</a><br>
      <a href="flyweight/FlyweightMidgetCar.java">FlyweightMidgetCar.java</a><br>
      <a href="flyweight/FlyweightSprintCar.java">FlyweightSprintCar.java</a><br>
      <a href="flyweight/RaceCar.java">RaceCar.java</a><br>
      <a href="flyweight/RaceCarClient.java">RaceCarClient.java</a><br>
      <a href="flyweight/RaceCarClientTest.java">RaceCarClientTest.java</a><br>
    </td>
    <td><a href="flyweight/trace.csv">trace.csv</a></td>
    <td><a href="flyweight/calltree.png">calltree.png</a> <br> <a href="flyweight/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="flyweight/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Interpreter</td>
    <td>Expression Parser</td>
    <td>
      <a href="interpreter/AdditionExpression.java">AdditionExpression.java</a><br>
      <a href="interpreter/Expression.java">Expression.java</a><br>
      <a href="interpreter/ExpressionParser.java">ExpressionParser.java</a><br>
      <a href="interpreter/ExpressionParserTest.java">ExpressionParserTest.java</a><br>
      <a href="interpreter/MultiplicationExpression.java">MultiplicationExpression.java</a><br>
      <a href="interpreter/NumberExpression.java">NumberExpression.java</a><br>
      <a href="interpreter/ParserUtil.java">ParserUtil.java</a><br>
      <a href="interpreter/SubtractionExpression.java">SubtractionExpression.java</a><br>
    </td>
    <td><a href="interpreter/trace.csv">trace.csv</a></td>
    <td><a href="interpreter/calltree.png">calltree.png</a> <br> <a href="interpreter/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="interpreter/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Iterator</td>
    <td>Pattern Iterator</td>
    <td>
      <a href="iterator/DesignPattern.java">DesignPattern.java</a><br>
      <a href="iterator/PatternAggregate.java">PatternAggregate.java</a><br>
      <a href="iterator/PatternAggregateImpl.java">PatternAggregateImpl.java</a><br>
      <a href="iterator/PatternAggregateImplTest.java">PatternAggregateImplTest.java</a><br>
      <a href="iterator/PatternIterator.java">PatternIterator.java</a><br>
      <a href="iterator/PatternIteratorImpl.java">PatternIteratorImpl.java</a><br>
    </td>
    <td><a href="iterator/trace.csv">trace.csv</a></td>
    <td><a href="iterator/calltree.png">calltree.png</a> <br> <a href="iterator/calltree_dp.png">calltree_dp.png</a> </td>
    <td><a href="iterator/sequencediagram.png">sequencediagram.png</a></td>
  </tr>
  <tr>
    <td>Mediator</td>
    <td>ArmedUnit Commander</td>
    <td>
      <a href="mediator/ArmedUnit.java>ArmedUnit.java</a><br>
      <a href="mediator/Commander.java">Commander.java</a><br>
      <a href="mediator/CommanderImpl.java">CommanderImpl.javaa</a><br>
      <a href="mediator/CommanderImplTest.java">CommanderImplTest.java</a><br>
      <a href="mediator/SoldierUnit.java">SoldierUnit.java</a><br>
      <a href="mediator/TankUnit.java">TankUnit.java</a><br>
    </td>
    <td><a href="mediator/trace.csv">trace.csv</a></td>
    <td><a href="mediator/calltree.png">calltree.png</a> <br> <a href="mediator/calltree_dp.png">calltree_dp.png</a> </td>
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
