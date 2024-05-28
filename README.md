# MÉTODO FACTORY E SUAS VANTAGENS
por <a href="https://www.github.com/dgomp">Diego Parente</a>, <a href="https://www.github.com/evaristux">Gabriel Evaristo</a> e <a href="https://www.github.com/Sam11230982">Samuel Holanda</a>, para a cadeira de "Técnicas de Programação", da professora Neusa Liberato Evangelista (Uni7).


## O que é?

> O Factory Method é um padrão de projeto criacional, o que significa que seu principal objetivo é definir como os objetos são criados. Este padrão se concentra na criação de objetos por meio de uma interface comum, permitindo que subclasses decidam qual tipo de objeto concreto será instanciado. Outros exemplos de criacionais são o Abstract Factory, Bauilder, Prototype e o Singleton.
> 
> Este método permite que uma superclasse forneça uma interface para a criação de objetos, mas deixa para suas subclasses a responsabilidade de definir quais classes concretas serão instanciadas. Isso é feito através de um método de fábrica (factory method) especificado na superclasse e implementado pelas subclasses. Assim, a criação dos objetos é delegada para as subclasses, permitindo flexibilidade e extensibilidade no sistema, além de proteger o código e permitir que o mesmo sempre possa ser desenvolvido implementado nas subclasses.

## Para que serve?

> O Factory Method serve para resolver problemas de criação de objetos em situações onde a criação direta com o operador “new” levaria a um código rígido, difícil de manter e expandir, ou seja, que sempre necessitaria de uma intervenção maior e constante para sua implementação.
>
> Imagine que você possui uma fábrica de veículos e trabalha somente com a fabricação de carros. Depois de um tempo, sua fábrica de veículos passa a fabricar outros tipos de carros com os subtipos (SUV, Sedan e Hatch) e também moto com os subtipos (Trail, Scooter e Naked). Você passaria a ter que fazer várias alterações no código para verificar qual tipo de veículo está sendo fabricado naquele momento, ou seja, vários “if’s” e “else’s”, por exemplo.
>
> Com o Factory Method, você terá uma interface ou uma classe com um método abstract que delegara as subclasses factory o que será criado, carro ou moto e quais seus subtipos.
>
> Com isso, além do código ficar mais organizado, sempre que surgirem novos tipos de veículos a serem fabricados pelo fábrica (exemplo em tela), bastará criar classes para tipo de veículo a ser criado.

## Quais as vantagens? Há desvantagens?

* **Vantagens**

> Além do código ficar mais protegido (como o código interagirá com a interface “FactoryVehicle”, não precisa saber da existência de cada tipo de veículo no código), facilita a adição de novas opções (tipos de veículos), dado que bastará adicionar novas classes ou subclasses para os novos tipos de veículos. Além disso, traz a proteção da responsabilidade única, facilitando a manutenção.

* **Desvantagens**
  
> Como o foco é na criação de classes e subclasses, pode ser que isto deixe o código um pouco mais complexo, principalmente se pensarmos em um código pequeno. Outro ponto é que talvez o uso de interfaces, bem como classes abstratas, possa complicar um pouco a compreensão do fluxo do sistema, principalmente para quem não conhece como funciona o Factory Method.

## Como usar?
  
> A forma padrão de utilizar o Factory Method, é definindo as interfaces ou classes abstratas e criando subclasses concretas que implementem o método de fábrica. Depois, coloca um @Override nestas classes e define os métodos para cada uma.

* **Exemplo**

    1. Cria a interface "FactoryVehicle";
    2. Cria a interface “Vehicle”, com o método showObject();
    3. Cria duas classes, chamadas “Car” e “Bike”, vinculadas à interface “Vehicle”;
    4. Cria as subclasses “BikeNaked”, “BikeScooter” e “BikeTrail” a serem vinculadas à classe “Bike”;
    5. Cria as subclasses “CarHatch”, “CarSedan”, e “CarSuv” a serem vinculadas à classe “Car”;
    6. Cria as interfaces “FactoryCar” e “FactoryBike”, implementando a interface “FactoryVehicle”, de modo a poder criar diferentes tipos de veículos.

## Qual a diferença para o Abstract Factory?

> O Abstract Method fornece uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas, sendo utilizado quando há múltiplas famílias de produtos e é necessário garantir que os objetos criados sejam compatíveis entre si.
>
> Ou seja, enquanto o Factory Method foca em uma única classe, sendo, portanto, mais simples de usar, o Abstract Method trabalha com criação de famílias de objetos que possuem relação, portanto, mais complexo.

## Modelo UML

  ![image](https://github.com/dgomp/factory-method/blob/main/Modelo%20UML.png)

## Componentes do Modelo
1. PRODUTO - Interface Vehicle contendo o método showObject, os produtos que serão criados implementaram essa interface;
2. PRODUTO CONCRETO - Classes Car e Bike e seus subtipos CarHatch, CarSedan, CarSuv, BikeNaked, BikeTrail e BikeScooter. Essas classes são os possíveis produtos que serão fabricados por nossa fábrica de objetos;
3. CRIADOR DE OBJETOS - É nossa classe Abstract FactoryVehicle com dois abtracts métodos para fazer um gancho nas classes que a implementam;
4. CRIADOR DE OBJETOS CONCRETO - São as classes FactoryCar e FactoryBike, ambas com seus métodos implementados. Um método retorna uma instância do objeto Car ou Bike. Já o outro recebe um parâmetro e retorna uma instância de um dos subtipos.

## Referências

<div><a href="https://refactoring.guru/pt-br/design-patterns/factory-method">Refactoring Guru</a></div>
<div><a href="https://linux.ime.usp.br/~cainotis/mac0499/tese.pdf">Padrões de Projeto - Uma Abordagem Comparativa entre Java e Kotlin</a></div>
<div><a href="https://www.researchgate.net/profile/Italo-Di-Paolo/publication/343239907_Padrao_de_projeto_Factory_Method_aplicado_a_modelagem_e_estudos_da_dinamica_de_sistemas_eletricos_de_potencia/links/5f1f2dc192851cd5fa4e0cac/Padrao-de-projeto-Factory-Method-aplicado-a-modelagem-e-estudos-da-dinamica-de-sistemas-eletricos-de-potencia.pdf">Padrão de projeto Factory Method aplicado à modelagem e estudos da
dinâmica de sistemas elétricos de potência</a></div>
<div><a href="https://pt.wikipedia.org/wiki/Factory_Method">Wikipedia - Factory Method</a></div>
