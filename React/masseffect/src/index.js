import React from 'react';
import ReactDOM from 'react-dom/client';
import About from './components/about';
import AlienGreeter from './components/alien-greeter';
import CharacterViewer from './components/character-view';
import ContactSection from './components/contact-section';
import ContactInformation from './components/contact-us';
import Counter from './components/counter';
import GamesTable from './components/games-table';
import Intro from './components/intro';


const root = ReactDOM.createRoot(document.getElementById('root'));

// Function components can be invoked by using a syntax that makes them *look* like htmle tags
root.render(
  <React.StrictMode>
    <Intro/>
    <About/>
    <GamesTable/>
    <AlienGreeter/>
    <CharacterViewer/>
    <ContactSection/>
    <Counter/>  

  </React.StrictMode>
);

