# FRQ-Site
Simple Spring Boot Site to serve AP CSA FRQs. Website [Here](http://frq.sylicia.com/) 

## Links
- [Nathaniel C](http://frq.sylicia.com/nathan)
- [Tanay S](http://frq.sylicia.com/tanay)
- [Anthony V](http://frq.sylicia.com/anthony)
- [Eyaad M](http://frq.sylicia.com/eyaad)
- [Dhruv K](http://frq.sylicia.com/dhruv)

## Deployment
1. Configure maven runner to delegate IDE/Build actions
2. Build to jar ```target/frq-site.jar```
3. Move keys to ```keys/kashmir.key``` 
4. Run ```sh deploy.sh``` 

## Self-Grading 
### Eyaad Mir
Recursion
| Point | Score(0 or 1) | Justification with link |
| ----- | ------------- | ----------------------- |
| Build individual section into your Scrum Team project for execution | 1 | My individual controller is [here](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/EyaadController.java) with "public String recursion" for my recursion section |
| Build recursion example(s) into your individual section | 1 | My individual section for recursion can be seen [here](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Eyaad/Recursion.java) and [here](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/resources/templates/Eyaad/recursion.html) |
| Have default input that automatically runs and logs on a Web page | 1 | Default inputs can be seen [here](https://github.com/Altoid0/FRQ-Site/blob/be20664abbcabef9f1808651bc8db4762b4c2316/src/main/java/com/application/frq/EyaadController.java#L28-L39) |
| Have ability to adjust run based off of user input | 1 | Recursion page takes in user parameters [here](https://github.com/Altoid0/FRQ-Site/blob/be20664abbcabef9f1808651bc8db4762b4c2316/src/main/java/com/application/frq/EyaadController.java#L25) |
| WOW | 1 | I have analysis of time shown [here](https://github.com/Altoid0/FRQ-Site/blob/be20664abbcabef9f1808651bc8db4762b4c2316/src/main/java/com/application/frq/EyaadController.java#L26) and [here](https://github.com/Altoid0/FRQ-Site/blob/be20664abbcabef9f1808651bc8db4762b4c2316/src/main/java/com/application/frq/EyaadController.java#L43-L44) |

Inheritance
| Point | Score(0 or 1) | Justification with link |
| ----- | ------------- | ----------------------- |
| Build individual section into your Scrum Team project for execution | 1 | My individual controller is [here](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/EyaadController.java) with "public String inheritance" for my inheritance section |
| Build POJO example(s) | 1 | Super class [here](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Eyaad/Book.java) and subclass [here](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Eyaad/PictureBook.java) |
| Have default data that automatically displays on Web page (use toString) | 1 | Default inputs can be seen [here](https://github.com/Altoid0/FRQ-Site/blob/627c9026a393e2add598560045a94bd86b34f428/src/main/java/com/application/frq/EyaadController.java#L51-L56) |
| Build multiple derivates from Super via Extends | 1 | Use extention of super class [here](https://github.com/Altoid0/FRQ-Site/blob/627c9026a393e2add598560045a94bd86b34f428/src/main/java/com/application/frq/Eyaad/PictureBook.java#L3) |
| WOW | 1 | I have analysis of time shown [here](https://github.com/Altoid0/FRQ-Site/blob/627c9026a393e2add598560045a94bd86b34f428/src/main/java/com/application/frq/EyaadController.java#L50) and [here](https://github.com/Altoid0/FRQ-Site/blob/627c9026a393e2add598560045a94bd86b34f428/src/main/java/com/application/frq/EyaadController.java#L66-L67). Another WOW factor is my lab allows the user to put in an optional input which changes the output response. If it is not filled out there is no default value and is ignored, showing proper use of inheritance. |

Total Score: 10/10


### Nathaniel Cherian
Insertion
| Point | Score(0 or 1) | Justification with link |
| ----- | ------------- | ----------------------- |
| Build individual section into your Scrum Team project for execution | 1 | [Insertion Demo.](http://frq.sylicia.com/nathan/insertion)|
| Build insertion example(s) into your individual section | 1 | [Insertion Algo.](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Nathan/Insertion.java#L8-L28) |
| Have default input that automatically runs and logs on a Web page | 1 | [Spring Params](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/NathanController.java#L55-L74)|
| Have ability to adjust run based off of user input |  |[thymeleaf form](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/resources/templates/Nathan/insertion.html#L32-L39) |
| WOW | 1 |[Sort step through with bars](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/resources/templates/Nathan/insertion.html#L43-L137) |

Inheritance
| Point | Score(0 or 1) | Justification with link |
| ----- | ------------- | ----------------------- |
| Build individual section into your Scrum Team project for execution | 1 | [Inheritance Demo.](http://frq.sylicia.com/nathan/inheritance) |
| Build POJO example(s) | 1 | [POJO classes](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Nathan/Inheritance.java#L8-L75)  |
| Have default data that automatically displays on Web page (use toString) | 1 | [Collecting user Input/toString](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/NathanController.java#L76-L122) |
| Build multiple derivates from Super via Extends | 1 | [Inheritance Code](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Nathan/Inheritance.java#L8-L75) and [Diagram](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/resources/static/diagram.svg) |
| WOW | 1 | [Table to represent Lunchbox](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/resources/templates/Nathan/inheritance.html#L18-L33) |

Total Score: 10/10

### Anthony Vo
Recursion
| Point | Score(0 or 1) | Justification with link |
| ----- | ------------- | ----------------------- |
| Build individual section into your Scrum Team project for execution |  | |
| Build recursion example(s) into your individual section |  | |
| Have default input that automatically runs and logs on a Web page |  | |
| Have ability to adjust run based off of user input |  | |
| WOW |  | |

Inheritance
| Point | Score(0 or 1) | Justification with link |
| ----- | ------------- | ----------------------- |
| Build individual section into your Scrum Team project for execution |  | |
| Build POJO example(s) |  | |
| Have default data that automatically displays on Web page (use toString) |  | |
| Build multiple derivates from Super via Extends |  | |
| WOW |  | |

Total Score: 

### Tanay Shah
Recursion
| Point | Score(0 or 1) | Justification with link |
| ----- | ------------- | ----------------------- |
| Build individual section into your Scrum Team project for execution | 1 | [Link](https://github.com/Altoid0/FRQ-Site/tree/master/src/main/java/com/application/frq/Tanay) |
| Build recursion example(s) into your individual section | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Tanay/Recursion.java) |
| Have default input that automatically runs and logs on a Web page | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/TanayController.java#L27) |
| Have ability to adjust run based off of user input | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/TanayController.java#L27) |
| WOW | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Tanay/Recursion.java#L14-L20) |

Inheritance
| Point | Score(0 or 1) | Justification with link |
| ----- | ------------- | ----------------------- |
| Build individual section into your Scrum Team project for execution | 1 | [Link](https://github.com/Altoid0/FRQ-Site/tree/master/src/main/java/com/application/frq/Tanay) |
| Build POJO example(s) | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Tanay/Car.java) [Link2](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/TanayController.java#L46) |
| Have default data that automatically displays on Web page (use toString) | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/TanayController.java#L41-L44) [Link2](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Tanay/SportsCar.java#L18) |
| Build multiple derivates from Super via Extends | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Tanay/SportsCar.java#L3) |
| WOW | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Tanay/Car.java#L21-L37) |

Total Score: 10

### Dhruv Kanetkar
Recursion
| Point | Score(0 or 1) | Justification with link |
| ----- | ------------- | ----------------------- |
| Build individual section into your Scrum Team project for execution | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/DhruvController.java) recursion section starting at "public String recursion" |
| Build recursion example(s) into your individual section | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Dhruv/Recursion.java) |
| Have default input that automatically runs and logs on a Web page | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/DhruvController.java#L28) |
| Have ability to adjust run based off of user input | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/resources/templates/Dhruv/recursion.html#L17) |
| WOW | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Dhruv/Recursion.java) |

Inheritance
| Point | Score(0 or 1) | Justification with link |
| ----- | ------------- | ----------------------- |
| Build individual section into your Scrum Team project for execution | 1 | [Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Dhruv/Inheritance.java#L39) |
| Build POJO example(s) | 1 |[Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Dhruv/Inheritance.java#L13) |
| Have default data that automatically displays on Web page (use toString) | 1 |[Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/DhruvController.java#L56) |
| Build multiple derivates from Super via Extends | 1 |[Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Dhruv/Inheritance.java#L31) |
| WOW | 1 |[Link](https://github.com/Altoid0/FRQ-Site/blob/master/src/main/java/com/application/frq/Dhruv/Inheritance.java) |

Total Score: 10
