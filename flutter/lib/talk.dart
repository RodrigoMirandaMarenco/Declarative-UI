///
/// Created by Pablo Reyes [preyes@applaudostudios.com]
///
class Talk {
  final String title;
  final String description;
  final String picture;
  final Orator orator;

  Talk({
    this.title,
    this.description,
    this.picture,
    this.orator,
  });
}

class Orator {
  final String name;
  final String picture;

  Orator({this.name, this.picture});
}
