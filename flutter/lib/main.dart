import 'package:applaudo_anewhope/data.dart';
import 'package:flutter/material.dart';

import 'talk.dart';

void main() {
  runApp(UiForHumans());
}

class UiForHumans extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'UFH',
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        primarySwatch: Colors.green,
        visualDensity: VisualDensity.adaptivePlatformDensity,
      ),
      home: HomePage(),
    );
  }
}

class HomePage extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('UI for Humans'),
      ),
      body: ListView(
        children: _buildTalks(),
      ),
    );
  }

  List<Widget> _buildTalks() {
    final List<Widget> talks = [];
    dataTalks.forEach((talk) {
      talks.add(_buildTalk(talk));
    });
    return talks;
  }

  Widget _buildTalk(Talk talk) {
    return Card(
      margin: EdgeInsets.all(10.0),
      elevation: 5.0,
      child: Column(
        children: [
          FadeInImage(
            image: NetworkImage(talk.picture),
            placeholder: AssetImage('assets/applaudo_placeholder.jpg'),
          ),
          Padding(
            padding: EdgeInsets.only(
              left: 10.0,
              top: 5.0,
              right: 15.0,
              bottom: 15.0,
            ),
            child: Row(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Padding(
                  padding: EdgeInsets.only(top: 10.0),
                  child: ClipRRect(
                    borderRadius: BorderRadius.circular(40.0),
                    child: Image(
                      image: NetworkImage(talk.orator.picture),
                      height: 60.0,
                    ),
                  ),
                ),
                SizedBox(width: 20.0),
                Flexible(
                  child: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      SizedBox(height: 10.0),
                      Text(
                        talk.title,
                        style: TextStyle(
                          fontSize: 16,
                          fontWeight: FontWeight.bold,
                        ),
                      ),
                      SizedBox(height: 10.0),
                      Text(
                        talk.orator.name,
                        style: TextStyle(
                          fontStyle: FontStyle.italic,
                          color: Color.fromARGB(100, 0, 0, 0),
                        ),
                      ),
                      SizedBox(height: 10.0),
                      Text(talk.description),
                    ],
                  ),
                ),
              ],
            ),
          )
        ],
      ),
    );
  }
}
